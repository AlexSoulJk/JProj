package Huffman_implementation.Huffman_parts;

import java.io.IOException;

public class Base {
    private Decoder info;

    String inputFilename;
    String outputFilename;
    private long encodedSize;
    private long decodedSize;
    private double compressionRatio;

    public void getInfo(String filename) throws IOException { }
    public void printInfo()
    {
        info.printHuffmanCode();
        System.out.println("Original size: " + decodedSize + " bytes");
        System.out.println("Compressed size: " + encodedSize + " bytes");
        System.out.println("Compression ratio: " + compressionRatio * 100 + "%");
    }
}
