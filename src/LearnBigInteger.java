
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class LearnBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger b1 = new BigInteger(scanner.next());
        BigInteger b2 = new BigInteger(scanner.next());
        scanner.close();
        
        BigInteger b3,b4;
        b3=b1.add(b2);
        b4=b1.multiply(b2);
        System.out.println( b3);
        System.out.println( b4);
    }
}
