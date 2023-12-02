package LAB7;

import org.jetbrains.annotations.NotNull;


public class Swapper<T> {

    private static int count_of_object = 0;
    private final int number_of_object;

    private T data;
    public Swapper(T obj_to_swap) {
        count_of_object ++;
        number_of_object = count_of_object;
        System.out.println("Create obj_to_swap" + number_of_object);
        data = obj_to_swap;
    }

    public T getData()
    {
        return data;
    }

    public void swap(@NotNull Swapper<T> obj2)
    {
        System.out.printf("Swapping objects: %s and %s%n", this.getNameObj(), obj2.getNameObj());
        T tmp = data;
        data = obj2.data;
        obj2.data = tmp;
    }

    public String getNameObj(){
        return String.format("obj_to_swap%d", this.number_of_object);
    }
}
