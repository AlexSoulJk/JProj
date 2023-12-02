package LAB4;
enum Fruit {
    APPLE,
    BANANA,
    ORANGE
}
public class SwithShow {
    static String msg = "";
    public static void printSwitch(int a, String name){
        switch(a)
        {
            case 15, 2 -> msg = name + " = " + a;
            default -> msg = "Undefined for int " + name + " in switch";
        }
        System.out.println(msg);
    }

    public static void printSwitch(short a, String name){
        switch(a)
        {
            case 3, 8 -> msg = name + " = " + a;
            default -> msg = "Undefined number for short " + name + " in switch";
        }
        System.out.println(msg);
    }

    public static void printSwitch(String a, String name){
        switch(a)
        {
            case "Hello", "Test" -> msg = name + " = " + a;
            default -> msg = "Undefined number for string " + name + " in switch";
        }
        System.out.println(msg);
    }

    public static void printSwitch(byte a, String name){
        switch(a)
        {
            case 19, 20 -> msg = name + " = " + a;
            default -> msg = "Undefined number for byte " + name + " in switch";
        }
        System.out.println(msg);
    }

    public static void printSwitch(Fruit a, String name){
        switch(a)
        {
            case APPLE, BANANA, ORANGE -> msg = name + " = " + a;
            default -> msg = "Undefined number for Fruit " + name + " in switch";
        }
        System.out.println(msg);
    }

    public static void printSwitch(char a, String name){
        switch(a)
        {
            case 'a','b','c' -> msg = name + " = " + a;
            default -> msg = "Undefined number for char " + name + " in switch";
        }
        System.out.println(msg);
    }

    public static void main(String[] args)
    {
        int i = 5;
        short s = 4;
        byte b = 20;
        char c = 'a';
        String line = "Test";
        Fruit j = Fruit.BANANA;
        printSwitch(i,"i");
        printSwitch(s,"s");
        printSwitch(b,"b");
        printSwitch(c,"c");
        printSwitch(line,"line");
        printSwitch(j,"j");
    }
}
