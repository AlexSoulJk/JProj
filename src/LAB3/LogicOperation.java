package LAB3;

import java.util.function.Consumer;

public class LogicOperation {
    private static void print(String msg, int a, int b, int res){
        System.out.println(String.format(msg,
                Integer.toBinaryString(a),
                Integer.toBinaryString(b),
                Integer.toBinaryString(res),
                res));
    }

    private static void print_1(String msg, int a, int b, int res){
        System.out.println(String.format(msg,
                Integer.toBinaryString(a),
                b,
                Integer.toBinaryString(res),
                res));
    }

    public static void main(String[] args)
    {
        boolean T1 = true, T2 = true, T3 = false;
        int a = 11, b = 15;

        String msg = "Let a = 11, b = 15.\nmax(a,b) = ";

        System.out.println(msg + (a > b ? a : b));

        msg = "a&&b = %s && %s = %s = %d";
        print(msg, a,b,(a&b));//1011

        msg = "a||b = %s || %s = %s = %d";
        print(msg, a,b,(a|b));//1111

        msg = "a XOR b = %s XOR %s = %s = %d";
        print(msg, a,b,(a^b));//0100

        msg = "~a = ~(%s) = %s = %d ";
        System.out.println(String.format(msg,
                Integer.toBinaryString(a),
                Integer.toBinaryString(~a),
                ~a));
        System.out.println("Let b = 2.");
        b = 2;
        msg = "Then a>>b = %s>>%d = %s = %d;";
        print_1(msg, a,b,a>>b);

        msg = "a>>>b = %s>>>%d = %s = %d;";
        print_1(msg, a,b,a>>>b);

        msg = "a<<b = %s<<%d = %s = %d;";
        print_1(msg, a,b,a<<b);


        //About boolean operations
        msg = "Let T1 = %b, T2 = %b, T3 = %b.\nThen (T1&&!T2)||(T1&&T3)||(!T3^T2) = %b;";
        System.out.println(String.format(msg,T1,T2,T3,((T1&&!T2)||(T1&&T3)||(T3^T2))));
    }

}
