package java.com.stackroute.pe4;

import java.util.*;
public class CharCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the InputString:");
        String InputString = s.nextLine();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the character to be counted:");
        String InputCharacter = reader.nextLine();
        System.out.println("Len Of String:" + InputString.length());
        System.out.println("Len Of String Without a :" + InputString.replace(InputCharacter, "").length());
        int charcount = InputString.length() - InputString.replaceAll(InputCharacter, "").length();
        System.out.println("Occurrence Of specific character in String: " + charcount);
    }
}