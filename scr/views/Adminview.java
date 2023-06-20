package scr.views;

import java.util.Scanner;

import static scr.views.Login.menu;

public class Adminview {
    static Scanner sc = new Scanner(System.in);
    static int luachon =0;
    public static void employeeManager(){
        System.out.println(" Quản lí nhân viên");
        System.out.println("1.Thay đổi thông tin nhân viên");
        System.out.println("0.Trở về trang Admin");
        System.out.println("Mời chọn chức năng:");
        luachon = sc.nextInt();
        sc.nextLine();
    }
    public static void clientManager(){
        System.out.println("Quản lí khách hàng:");
        System.out.println("1.Thay đổi vai trò");
        System.out.println("2.Xóa khách hàng");
        System.out.println("0.Trở về trang Admin");
        System.out.println("Mời chọn chức năng:");
        luachon = sc.nextInt();
        sc.nextLine();
    }
    public static void foodManager(){
        System.out.println("Quản lí thực phẩm");
        System.out.println("1.Thay đổi thông tin món");
        System.out.println("2.Thêm món");
        System.out.println("3.Xóa món");
        System.out.println("0.Trở về trang Admin");
        System.out.println("Mời chọn chức năng:");
        luachon = sc.nextInt();
        sc.nextLine();
    }
    public static void adminMenu() {
        System.out.println("Chào mừng bà chúa Tuyêt ");
        System.out.println("1. Thay đổi thông tin admin");
        System.out.println("2. Quản lí nhân viên");
        System.out.println("3. Quản lí khách hàng");
        System.out.println("4. Quản lí thực phẩm");
        System.out.println("5. Doanh thu");
        System.out.println("0. Trở về trang chính");
        System.out.println("Mời chọn chức năng:");
        luachon = sc.nextInt();
        sc.nextLine();
        do {
            menu();
            switch (luachon){
                case 1 :
                case 2 :employeeManager();
                case 3 :clientManager();
                case 4 :foodManager();
                case 5 :
                default:
                    System.out.println("Bạn nhập kí tự không hợp lệ, mời nhập lại");
                    adminMenu();
            }
        } while (luachon!=0);
    }
    }



