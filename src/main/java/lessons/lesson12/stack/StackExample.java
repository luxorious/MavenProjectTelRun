package lessons.lesson12.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("I");
        stack.push("Love");
        stack.push("Java");

        System.out.println(stack);

        System.out.println(stack.search("I"));

        System.out.println("The element at the top of stack is " + stack.peek());

        System.out.println(stack);

        System.out.println("pop element " + stack.pop());

        System.out.println(stack);
        System.out.println("pop element " + stack.pop());
        System.out.println("pop element " + stack.pop());


        System.out.println(stack.empty());




    }
}
