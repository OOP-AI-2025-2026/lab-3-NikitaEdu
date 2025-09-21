package org.example.task2;

import java.util.Arrays;

public class IntStack {
    private int[] stack;
    private int top; // Індекс вершини стека
    private static final int INITIAL_CAPACITY = 10; // Початковий розмір масиву

    public IntStack() {
        stack = new int[INITIAL_CAPACITY];
        top = -1; // Стек порожній
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            expand(); // Збільшення масиву, якщо стек переповнений
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!"); // Викидання винятку при спробі вилучення з порожнього стека
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!"); // Викидання винятку при спробі перегляду порожнього стека
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void clear() {
        Arrays.fill(stack, 0);
        top = -1; // Просто скидаємо індекс вершини
    }

    private void expand() {
        int newCapacity = stack.length * 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}