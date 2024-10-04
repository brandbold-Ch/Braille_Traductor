package main.java.modules;
import java.util.Arrays;
import main.java.modules.*;

public class Interpreter {

    private byte[] h = { 1, 0, 1, 1, 0, 0 }; 
    private byte[] o = { 1, 0, 0, 1, 1, 0 }; 
    private byte[] l = { 1, 0, 1, 0, 1, 0 };
    private byte[] a = { 1, 0, 0, 0, 0, 0 }; 

    private byte[] space = { 0, 0, 0, 0, 0, 0 }; 

    private byte[] a2 = { 1, 0, 0, 0, 0, 0 }; 

    private byte[] espace2 = { 0, 0, 0, 0, 0, 0 };

    private byte[] t = { 0, 1, 1, 1, 1, 0 }; 
    private byte[] o2 = { 1, 0, 0, 1, 1, 0 }; 
    private byte[] d = { 1, 1, 0, 1, 0, 0 }; 
    private byte[] o3 = { 1, 0, 0, 1, 1, 0 };
    private byte[] s = { 0, 1, 1, 0, 1, 0 };

    byte[][] arrayBytes = new byte[][]{h, o, l, a, space, a2, espace2, t, o2, d, o3, s};
    StringBuffer word = new StringBuffer();

    public void test() {
        Alphabet[] enums = Alphabet.class.getEnumConstants();

        for (byte[] array: arrayBytes) {
            for (Alphabet alphabet : enums) {
                if (Arrays.equals(alphabet.getCombination(), array)) {
                    word.append(alphabet.getValue());
                }
            }
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        interpreter.test();
    }   
}
