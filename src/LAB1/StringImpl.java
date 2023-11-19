package LAB1;

import java.sql.SQLOutput;

public class StringImpl {
    public static void main(String[] args){

        System.out.println("PolyTech university topic.\n");
        String example1 = "Ex1: There are many subjects at my university.\n";

        System.out.println(example1 + String.join(", ", "By using join" ,
                "for example",
                "Java lessons",
                "science of programming C++",
                "theory of the function of a complex variable."));

        String example2 = "Ex2: Moreover, the university was founded in ";
        example2 += 189 + (9 + ".");
        example2 += " So next year it will turn " + (2024 - 1899) + " on 19 February.";
        System.out.println(example2 + "\n");

        String msg_comparing = "Let's compare Ex1 with Ex2. So ";
        String compare_msg = example2!=example1 ? "is not" : "is";
        System.out.println(msg_comparing + "Ex1 " + compare_msg + " Ex2.");

        String example3 = "Test";
        msg_comparing = "Let Ex3 equals " + example3 + ". Let's compare Ex3 with Test. So ";
        compare_msg = example3=="Test" ? "=" : "!=";
        System.out.println(msg_comparing + "Ex3 " + compare_msg + " Test.");
        
        String example4 = null;
        String example5 = "";
        msg_comparing = "Let Ex4 equals " + example4 + " and Ex5 be empty. Let's compare Ex4 with Ex5. So ";
        System.out.println(msg_comparing + "Ex5 " + (example5 == example4 ? "=" : "!=") + " null.");
        
        String example6 = "TEST";
        msg_comparing = "Let Ex6 equals " + example6 + ". Let's compare Ex6 with Ex3. ";
        msg_comparing += "Ex6 " + (example6!=example3 ? "!=" : "=") + " Ex3.\n";
        msg_comparing += "However, if we will compare ignoring case. ";
        msg_comparing += "Ex6 " + (example6.equalsIgnoreCase(example3) ? "=" : "!=") + " Ex3.\n";
        System.out.println(msg_comparing);

        String example7 = "   Alex Solomatov   ";
        String s8 = example7.trim().substring(0,4);
        String msg = "Let Ex7 equals " + example7 + ".\n";
        msg += "So, length of Ex7 equals " + example7.length();
        msg += ".\nHowever, if we would trim Ex7 it length will be " + example7.trim().length();
        msg += ".\nBy using substring, my name is " + s8 + ".\n";
        System.out.println(msg);
    }
}
