package ass7;

import java.util.EmptyStackException;

public class DoublyLinkedListStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        private Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public DoublyLinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int size() {
        return this.size;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top.prev = newNode;
            this.top = newNode;
        }
        this.size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T poppedItem = this.top.data;
        if (this.top.next == null) {
            this.top = null;
        } else {
            this.top = this.top.next;
            this.top.prev = null;
        }
        this.size--;
        return poppedItem;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.top.data;
    }
    public static void main(String[] args) {
        DoublyLinkedListStack<Integer> stack = new DoublyLinkedListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size of the Stack: " + stack.size()); // Size of the Stack: 3
        System.out.println(stack.pop() + " is deleted"); // 3 is deleted
        System.out.println(stack.peek() + " is on top of stack"); // 2 is on top of stack
    }

}
