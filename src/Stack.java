
/**
 * Create by Patryk Łubik on 11.12.2021.
 */

class Stack {

    java.util.Stack<Integer> stack;
    Integer minVale;


    Stack() { stack = new java.util.Stack<Integer>(); }


    void push(Integer x) {
        if (stack.isEmpty()) {
            stack.push(x);
            minVale = x;
            System.out.println("Pushed number: " + x);
            return;
        }

        if (x < minVale) {
            stack.push(2*x - minVale);
            minVale = x;
        } else {
            stack.push(x);
        }

        System.out.println("Pushed number: " + x);
    }

    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer temp = stack.pop();
        System.out.print("Delete number: ");

        if (temp < minVale) {
            System.out.println(minVale);
            minVale = 2* minVale - temp;
        } else {
            System.out.println(temp);
        }
    }

    void peekMin() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Minimum Element: " + minVale);
        }
    }
}
