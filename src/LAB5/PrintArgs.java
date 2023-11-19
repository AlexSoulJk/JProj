package LAB5;

public class PrintArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("List of args is empty");
            return;
        }
        String format = "arg[%d] = %s\n";
        System.out.println("List of args:\n");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) sb.append(String.format(format, i, args[i]));
        System.out.println(sb);
    }
}
