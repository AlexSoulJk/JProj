package LAB8;
import LAB8.TestClass.TestClass;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args)
    {
        TestClass instance = new TestClass("Test_data");
        Class<?> who_am_i = instance.getClass();
        System.out.println(getClassInfo(who_am_i));
    }
    public static String getClassInfo(Class<?> instance)
    {
        return getClassName(instance) +
                getEveryConstructor(instance) +
                getClassFields(instance) +
                getClassMethods(instance) +
                getClassInterfaces(instance);
    }
    public static String getClassName(Class<?> instance)
    {
        return "@Class name:\n"+ getModifierName(instance.getModifiers()) + instance.getName() + "\n";
    }
    public static String getModifierName(int id_modifier){
        if (Modifier.isPublic(id_modifier))
            return "public ";
        if (Modifier.isAbstract(id_modifier))
            return "abstract ";
        if (Modifier.isFinal(id_modifier))
            return "final ";
        return "Undefined modifier ";
    }

    public static String getEveryConstructor(Class<?> instance)
    {
        return "@Constructors:\n" + Arrays.stream(instance.getDeclaredConstructors())
                .map(constructor ->getModifierName(constructor.getModifiers()) + constructor.getName()
                        + "(" + Arrays.stream(constructor.getParameterTypes())
                        .map(Class::getSimpleName).collect(Collectors.joining(", ")) + ")")
                .collect(Collectors.joining("\n")) + "\n";
    }

    public static String getClassFields(Class<?> instance)
    {
        return "@Fields:\n" + Arrays.stream(instance.getDeclaredFields())
                .map(field -> field.getType().getSimpleName() + " " + field.getName())
                .collect(Collectors.joining("\n")) + "\n";
    }
    public static String getClassMethods(Class<?> instance)
    {
        return "@Methods:\n" + Arrays.stream(instance.getDeclaredMethods())
            .map(method ->getModifierName(method.getModifiers()) + method.getReturnType().getSimpleName() + " " + method.getName()
                    + "(" + Arrays.stream(method.getParameterTypes())
                        .map(Class::getSimpleName).collect(Collectors.joining(", ")) + ")")
            .collect(Collectors.joining("\n")) + "\n";
    }
    public static String getClassInterfaces(Class<?> instance)
    {
        return "@List of interfaces:\n" + Arrays.stream(instance.getInterfaces())
                .map(Class::getSimpleName)
                .collect(Collectors.joining("\n"));
    }
}
