package com.java.exam;

class Stack {
    int[] arr;
    int top;
    int size;
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    boolean isFull() {
        return top == size - 1;
    }
    boolean isEmpty() {
        return top == -1;
    }
    void push(int x) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = x;
    }
    int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }
    int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }
    void printStack() {

        System.out.print("Stack: [");

        for (int i = 0; i <= top; i++) {

            System.out.print(arr[i]);

            if (i != top) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Pushed: 10 20 30 40 50");
        System.out.println("Peek: " + s.peek());
        System.out.print("Popped: ");
        System.out.print(s.pop() + " ");
        System.out.print(s.pop() + " ");
        System.out.print(s.pop() + " ");
        System.out.println();
        s.printStack();
    }
}