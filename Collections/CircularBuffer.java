package Collections;
import java.util.*;

public class CircularBuffer {
    private int[] buffer;
    private int head = 0, tail = 0, size = 0, capacity;
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }
    public void add(int x) {
        buffer[tail] = x;
        tail = (tail + 1) % capacity;
        if (size < capacity) size++;
        else head = (head + 1) % capacity;
    }
    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(buffer[(head + i) % capacity]);
        }
        return result;
    }
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1); cb.add(2); cb.add(3);
        System.out.println("Buffer: " + cb.getBuffer());
        cb.add(4);
        System.out.println("Buffer after adding 4: " + cb.getBuffer());
    }
} 