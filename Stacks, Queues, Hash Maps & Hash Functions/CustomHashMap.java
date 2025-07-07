

import java.util.*;

public class CustomHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        Node(K key, V value) { this.key = key; this.value = value; }
    }

    private final int SIZE = 16;
    private Node<K, V>[] table;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        table = new Node[SIZE];
    }

    private int hash(K key) {
        return (key == null ? 0 : key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int idx = hash(key);
        Node<K, V> node = table[idx];
        for (; node != null; node = node.next) {
            if (Objects.equals(node.key, key)) {
                node.value = value;
                return;
            }
        }
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = table[idx];
        table[idx] = newNode;
    }

    public V get(K key) {
        int idx = hash(key);
        Node<K, V> node = table[idx];
        while (node != null) {
            if (Objects.equals(node.key, key)) return node.value;
            node = node.next;
        }
        return null;
    }

    public void remove(K key) {
        int idx = hash(key);
        Node<K, V> node = table[idx], prev = null;
        while (node != null) {
            if (Objects.equals(node.key, key)) {
                if (prev == null) table[idx] = node.next;
                else prev.next = node.next;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("a", 3);
        System.out.println("Get a: " + map.get("a")); // 3
        System.out.println("Get b: " + map.get("b")); // 2
        map.remove("a");
        System.out.println("Get a after remove: " + map.get("a")); // null
    }
} 