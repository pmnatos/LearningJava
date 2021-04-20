package StringReversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class StringRev {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        String revInput = stringBuilder.append(input).reverse().toString();
        if(revInput.equalsIgnoreCase(input)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
