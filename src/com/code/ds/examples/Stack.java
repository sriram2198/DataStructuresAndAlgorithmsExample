package com.code.ds.examples;

public class Stack {

    public static void main (String[] args) {

        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Virat", "kohli", 111));
        stack.push(new Employee("MS", "dhoni", 121));
        stack.push(new Employee("jane", "jones", 119));
        stack.push(new Employee("mike", "wilson", 333));

        stack.printStack();
       //System.out.println(stack.peek());  // Access the top element on the stack..
        //System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
