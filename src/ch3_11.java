import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;

public class ch3_11 {
    public static void main(String[] args) throws IOException {

        String num;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter float number: ");
        num = buf.readLine();
        System.out.println(num);

    }
}
