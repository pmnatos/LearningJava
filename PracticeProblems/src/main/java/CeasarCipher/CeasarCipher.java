package CeasarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CeasarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            //System.out.println("Char:" + c);
            int charAsciiVal = (int) c;
            int rotateBack = k % 26;
            int diff = 0;
            if((charAsciiVal - rotateBack)<65){
                diff = 65 - (charAsciiVal - rotateBack);
                stringBuilder.append((char)(((int)"Z".charAt(0)+1) - diff));
                continue;
            }
            stringBuilder.append((char)(charAsciiVal - rotateBack));
        }
        String decryptedString = stringBuilder.toString();
        System.out.println(decryptedString);
    }
}
