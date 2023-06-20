package scr.ulti;

import java.util.Scanner;

public class getValue {
    static Scanner input = new Scanner(System.in);
    public static String getString(String str){
        System.out.println(str);
        return input.nextLine();
    }
}
