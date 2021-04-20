package Anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        int arrA[] = new int[26];
        int arrB[] = new int[26];
        // Complete the function
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        for(int i=0;i<aLower.length();i++){
            ++arrA[(int)(aLower.charAt(i))-97];
        }

        for(int i=0;i<bLower.length();i++){
            ++arrB[(int)(bLower.charAt(i))-97];
        }

        for(int i=0;i<arrA.length;i++){
            if(arrA[i]!=arrB[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        bufferedReader.close();*/
        String s = "He is a very very good boy, isn't he?";
        String[] arrs = s.split("[ !,?._'@]+");
        System.out.println(arrs.length);
    }
}