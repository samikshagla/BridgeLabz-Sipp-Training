package LinkedList;

import java.util.*;

class ProcessNode {
    int processId;
    int burstTime;
    int priority;
    int waitingTime = 0;
    int turnAroundTime = 0;
    ProcessNode next;
    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

public class RoundRobinCircularLinkedList {
    private ProcessNode head = null, tail = null;
    private int timeQuantum = 4;

    public void addAtEnd(int id, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(id, burst, priority);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.processId == id) {
            if (head == tail) { head = tail = null; return; }
            head = head.next;
            tail.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head && temp.next.processId != id) temp = temp.next;
        if (temp.next.processId == id) {
            if (temp.next == tail) tail = temp;
            temp.next = temp.next.next;
        }
    }

    public void displayAll() {
        if (head == null) return;
        ProcessNode temp = head;
        do {
            System.out.println("ID: " + temp.processId + ", Burst: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public void simulateScheduling() {
        if (head == null) return;
        List<ProcessNode> finished = new ArrayList<>();
        int time = 0;
        ProcessNode temp = head;
        while (finished.size() < countProcesses()) {
            if (temp.burstTime > 0) {
                int exec = Math.min(timeQuantum, temp.burstTime);
                temp.burstTime -= exec;
                time += exec;
                if (temp.burstTime == 0 && temp.turnAroundTime == 0) {
                    temp.turnAroundTime = time;
                    finished.add(temp);
                }
            }
            temp = temp.next;
        }
       
        for (ProcessNode p : finished) {
            p.waitingTime = p.turnAroundTime - (p.turnAroundTime - p.waitingTime) - (p.burstTime + (p.turnAroundTime - p.waitingTime));
        }
        double avgWT = finished.stream().mapToInt(p -> p.turnAroundTime - (p.burstTime + (p.turnAroundTime - p.waitingTime))).average().orElse(0);
        double avgTAT = finished.stream().mapToInt(p -> p.turnAroundTime).average().orElse(0);
        System.out.println("Average Waiting Time: " + avgWT);
        System.out.println("Average Turnaround Time: " + avgTAT);
    }

    public int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        RoundRobinCircularLinkedList rr = new RoundRobinCircularLinkedList();
        rr.addAtEnd(1, 10, 1);
        rr.addAtEnd(2, 5, 2);
        rr.addAtEnd(3, 8, 1);
        rr.displayAll();
        System.out.println("--- Simulate Scheduling ---");
        rr.simulateScheduling();
    }
} 