package org.example;

public class MyCircularDeque {
    private final int[] deque;
    private int size;
    private int front;
    private int last;
    private final int totalSize;

    public MyCircularDeque(int k) {
        deque = new int[k];
        size = 0;
        front = 0;
        last = 0;
        totalSize = k;
    }

    public boolean insertFront(int value) {
        if(isFull()) {
            return false;
        }
        if(front == 0) {
            front = totalSize - 1;
        } else {
            front--;
        }
        deque[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if(isFull()) {
            return false;
        }

        deque[last] = value;
        if (last == totalSize - 1) {
            last = 0;
        } else {
            last++;
        }
        size++;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()) {
            return false;
        }
        deque[front] = -1;
        if (front == totalSize -1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }
        if(last == 0) {
            last = totalSize-1;
        } else {
            last--;
        }
        deque[last] = -1;
        size--;
        return true;
    }

    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return deque[front];
    }

    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        if(last == 0) {
            return deque[totalSize -1];
        }
        return deque[last-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == totalSize;
    }

    public int[] getArray() {
        return deque;
    }

    public int[] getAll() {
        return new int[]{front, last, size};
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */