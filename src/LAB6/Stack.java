package LAB6;
import java.util.Arrays;

public class Stack<T> {
    private final static String FORMATPRINT = "arg[%d] = %s\n", EMTYSTACKMESSAGE = "Your stack is empty";
    private int length = 0;
    private T[] values;

    public Stack(int i)
    {
        System.out.println("Base constructor");
        if (i <= 0){
            System.out.println("You chose invalid capacity value, that's why capacity = 1");
        }
        values = (T[]) new Object[i <= 0 ? length + 1 : i];
    }
    public boolean isEmpty()
    {
        return length == 0;
    }

    public void push(T i)
    {
        if(length == values.length){
            System.out.printf("\nChange capacity of stack. Was %d, now %d", length, length * 2);
            values = Arrays.copyOf(values, 2 * values.length);
        }

        System.out.printf("\nPushing element number %d\n", length + 1);
        values[length] = i;
        length++;

    }

    public T pop()
    {
        if (isEmpty()) {
            System.out.println("Error: " + EMTYSTACKMESSAGE);
            return null;
        }

        length--;
        T tmp = values[length];


        if (length == values.length / 2 ){
            System.out.printf("Change capacity of stack. Was %d, now %d\n", values.length, length);
            values = Arrays.copyOf(values, length);
        }

        return tmp;
    }
    public void print()
    {
        if (isEmpty()) {
            System.out.println(EMTYSTACKMESSAGE);
            return;
        }
        System.out.println("Your stack is:");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++)
            sb.append(String.format(FORMATPRINT,i + 1, values[i]));
        System.out.println(sb);
    }
}
