package scr.ulti;

import java.util.Scanner;

public class getValue {
    static Scanner sc =new Scanner(System.in);
    public static String getString(String str){
        System.out.println(str);
        return sc.nextLine();
    }
}
