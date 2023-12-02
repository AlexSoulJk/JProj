package LAB7;

public class Main {
    public static void main(String[] args)
    {
        String data1 = "Data_1", data2 = "Data_2";
        Swapper<Object_to_swap> swapper_obj1 = new Swapper<>(new Object_to_swap(data1));
        Swapper<Object_to_swap> swapper_obj2 = new Swapper<>(new Object_to_swap(data2));
        System.out.printf("let obj_to_swap1 data = %s\n", data1);
        System.out.printf("let obj_to_swap2 data = %s\n", data2);
        swapper_obj1.swap(swapper_obj2);

        System.out.println("The result of swapping is:");
        System.out.println(swapper_obj1.getNameObj() + " with data: " + swapper_obj1.getData().getData());
        System.out.println(swapper_obj2.getNameObj() + " with data: " + swapper_obj2.getData().getData());
    }
}
