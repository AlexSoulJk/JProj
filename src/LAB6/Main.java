package LAB6;

public class Main {
    public static void main(String[] args)
    {
        Stack<Integer> test_stack  = new Stack<>(0);

        test_stack.print();

        for (int index = 0; index < 5; index++)
            test_stack.push(index);

        test_stack.print();

        System.out.printf("The result of pop is %d\n", test_stack.pop());
        test_stack.print();

        for (int index = 0; index < 5; index += 1){
            System.out.printf("The result of pop is %d\n\n", test_stack.pop());
        }

    }
}
