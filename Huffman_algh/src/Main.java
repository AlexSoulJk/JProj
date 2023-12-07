import Huffman_implementation.Huffman_parts.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("Incorrect request in Huffman/src folder");
            System.out.println("Use: java Main <encode/decode/info> <inputFile>");
            return;
        }

        String mode = args[0].toLowerCase();
        String inputFile = args[1];
        try
        {
            switch (mode)
            {
                case "encode" ->
                        {
                            Encoder huffman = new Encoder();
                            huffman.encode(inputFile);
                        }
                case "decode" ->
                        {
                            Decoder huffman = new Decoder();
                            huffman.decode(inputFile);
                        }
                case "info" ->
                        {
                            Info huffman = new Info();
                            huffman.getInfo(inputFile);
                            huffman.printInfo();
                        }
                default ->
                        System.out.println("Invalid mode. Use 'encode', 'decode', or 'info'");
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
