package LinkedList;

import java.util.*;

class FriendNode {
    int userId;
    String name;
    int age;
    Set<Integer> friendIds = new HashSet<>();
    FriendNode next;
    public FriendNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.next = null;
    }
}

public class SocialMediaFriendSinglyLinkedList {
    private FriendNode head;

    public void addUser(int userId, String name, int age) {
        FriendNode newNode = new FriendNode(userId, name, age);
        newNode.next = head;
        head = newNode;
    }

    public FriendNode searchById(int userId) {
        FriendNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public FriendNode searchByName(String name) {
        FriendNode temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        FriendNode user1 = searchById(userId1);
        FriendNode user2 = searchById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1);
        }
    }

    public void removeFriendConnection(int userId1, int userId2) {
        FriendNode user1 = searchById(userId1);
        FriendNode user2 = searchById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(userId2);
            user2.friendIds.remove(userId1);
        }
    }

    public Set<Integer> findMutualFriends(int userId1, int userId2) {
        FriendNode user1 = searchById(userId1);
        FriendNode user2 = searchById(userId2);
        if (user1 == null || user2 == null) return Collections.emptySet();
        Set<Integer> mutual = new HashSet<>(user1.friendIds);
        mutual.retainAll(user2.friendIds);
        return mutual;
    }

    public void displayFriends(int userId) {
        FriendNode user = searchById(userId);
        if (user == null) return;
        System.out.print(user.name + "'s friends: ");
        for (int fid : user.friendIds) {
            FriendNode f = searchById(fid);
            if (f != null) System.out.print(f.name + " ");
        }
        System.out.println();
    }

    public int countFriends(int userId) {
        FriendNode user = searchById(userId);
        return user == null ? 0 : user.friendIds.size();
    }

    public static void main(String[] args) {
        SocialMediaFriendSinglyLinkedList sm = new SocialMediaFriendSinglyLinkedList();
        sm.addUser(1, "Alice", 20);
        sm.addUser(2, "Bob", 21);
        sm.addUser(3, "Charlie", 22);
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.displayFriends(1);
        sm.displayFriends(2);
        System.out.println("Mutual friends of 1 and 2: " + sm.findMutualFriends(1, 2));
        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);
    }
} 