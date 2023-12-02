package LAB10;
enum Fruit {
    APPLE,
    BANANA,
    ORANGE
}
public class Main
{
    public static void TestForTriple(Triple<?> instance)
    {
        try
        {
            System.out.println("Max: " + instance.max());
            System.out.println("Mean: " + instance.mean());
            System.out.println("Min: " + instance.min());
        }
        catch (RuntimeException e)
        {
            System.out.println("Exeption: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {

        Triple<Integer> inst1 = new Triple<>(12, 20, 35);
        inst1.setSecond(null);
        TestForTriple(inst1);

        Triple<String> inst2 = new Triple<>("A", "b", "P");
        TestForTriple(inst2);
        inst2.setFirst("PAF");
        TestForTriple(inst2);

        Triple<Fruit> inst3 = new Triple<>(Fruit.APPLE, Fruit.BANANA, Fruit.ORANGE);
        TestForTriple(inst3);
        inst3.setThird(Fruit.APPLE);
        TestForTriple(inst3);
        System.out.println("On first place: " + inst3.get(Place.first).toString());
    }
}
