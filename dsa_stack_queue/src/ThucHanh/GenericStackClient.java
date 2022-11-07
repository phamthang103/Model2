package ThucHanh;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop elememt from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3 Size of stack after push operations: " + stack.size());
    }

    private static void stackOfInterger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 kich thuoc stack " + stack.size());
        System.out.println("2.2 Pop elememt from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("3.1 Size of stack after push operations: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1.Stack String");
        stackOfIStrings();
        System.out.println("1.Stack Integer");
        stackOfInterger();
    }
}

