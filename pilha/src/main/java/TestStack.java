public class TestStack {

    public static void print(Stack stack) {
        System.out.print("Top ");
        Node node = null;
        while ((node = stack.pop()) != null) {
            System.out.print(node.data + " -> ");
        }
        System.out.print("End\n");
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        print(stack);

    }
}
