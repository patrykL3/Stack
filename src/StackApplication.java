/**
 * Create by Patryk Łubik on 11.12.2021.
 */
public class StackApplication {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(50);
        stack.push(82);
        stack.pop();
        stack.push(174);
        stack.peekMin();
    }
}
