package LAB9;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        TestClass me = new TestClass("Test_data");

        String classSimpleName = me.getClass().getSimpleName();
        String className = me.getClass().getName();

        System.out.println("Class name: "
                + className);

        Class<?> instance = TryFindClass(classSimpleName);
        instance = TryFindClass(className);

        Constructor<?> constructor = TryFindConstructorClass(instance, Integer.class, String.class);
        constructor = TryFindConstructorClass(instance, String.class);

        Object copyOfMe = TryNewInstance(constructor, 10);
        copyOfMe = TryNewInstance(constructor, "Vasya");

        String setData = "setData";
        String print = "print";

        Method methodSetData = TryFindMethodClass(instance, "Some_stranger_method_idk_how_it_can_be_in_class",
                String.class), methodPrint = TryFindMethodClass(instance, print);
        methodSetData = TryFindMethodClass(instance, setData, String.class);
        
        TryInvoke(methodSetData, copyOfMe, "Test_variable");
        TryInvoke(methodPrint, copyOfMe);
        TryInvoke(methodSetData, copyOfMe, 10);
    }

    public static Class<?> TryFindClass(String className){
        try{
            System.out.println("\nTrying to class " + className);
            return Class.forName(className);
        }catch (ClassNotFoundException e){
            System.out.printf("Error:: Class %s not found\n", className);
            return null;
        }
    }

    public static Constructor<?> TryFindConstructorClass(Class<?> instance, Class<?>... params){
        String msg = msgCreator(params);
        try{
            System.out.println("\nTrying to find constructor with param_types " + msg);
            return instance.getConstructor(params);
        }catch (NoSuchMethodException | SecurityException e){
            System.out.printf("Error:: Class %s hasn't got a constructor with %s\n",
                    instance.getSimpleName(), msg);
            return null;
        }
    }

    public static Object TryNewInstance(Constructor<?> constructor, Object... params){
        String msg = msgCreator(params);
        try{
            System.out.println("\nTrying to create new instance with value " + msg);
            return constructor.newInstance(params);
        }catch (InstantiationException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e ){
            System.out.printf("Error:: Class %s hasn't got a constructor with that will handle value %s\n",
                    constructor.getName(), msg);
            return null;
        }
    }

    public static Method TryFindMethodClass(Class<?> instance, String methodName, Class<?>... params){
        String msg = msgCreator(params);
        try{
            System.out.println("\nTrying to find method " + methodName
                    + " with param_types " + (msg.isEmpty() ? msg : "void"));
            return instance.getMethod(methodName, params);
        }catch (NoSuchMethodException | SecurityException e){
            System.out.printf("Error:: Class %s hasn't got a method %s(%s)\n",
                    instance.getSimpleName(), methodName, msg);
            return null;
        }
    }

    public static Object TryInvoke(Method method, Object instance, Object... params){
        String msg = msgCreator(params);
        try{
            System.out.println("\nTrying to call " + instance.getClass() + "::"+ method.getName() + "(" + msg + ")");
            return method.invoke(instance, params);
        }catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e){
            System.out.printf("Error:: Can't %s invoking with arguments %s: %s\n",
                    method.getName(), msg, e.getMessage());
            return null;
        }
    }
    public static String msgCreator(Class<?>... params){
        return Arrays.stream(params).map(Class::getSimpleName).collect(Collectors.joining(", "));
    }

    public static String msgCreator(Object... params){
        return Arrays.stream(params).map(Object::toString).collect(Collectors.joining(", "));
    }

}
