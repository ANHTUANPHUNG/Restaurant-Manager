package scr.views;

import java.util.Scanner;

import static scr.ulti.getValue.getString;
import static scr.views.Adminview.adminMenu;

public class Login {
    static Scanner sc = new Scanner(System.in);
    static int luachon = 0;

    public static boolean dangnhap() {
       boolean trangthai = false;
        String userName = getString("nhập tài khoản");

        String passWord = getString("nhập mật khẩu");
        if (userName.equals("abc") && passWord.equals("abc")) {
            System.out.println("đntc");
            trangthai = true;
        }
        return trangthai;
    }

    public static void EmployeeMenu(){
        System.out.println("Chào mừng nhân viên yêu quý");
        System.out.println("1. Chọn món");
        System.out.println("2. Quản lí thực phẩm");
        System.out.println("3. Quản lí khách hàng");
        System.out.println("0. Trở về trang đăng nhập");
        System.out.println("Mời chọn chức năng:");
    }
    public static void menu(){
        System.out.println("Chào mừng bạn đến với phần mềm quản lí");
        System.out.println("1. Đăng nhập ");
        System.out.println("2. Đăng Kí ");
        System.out.println("0. Thoát chương trình ");
        System.out.println("Mời chọn chức năng:");
        luachon = sc.nextInt();
        sc.nextLine();
    }

    public static void main(String[] args) {

         luachon = 0;
        do {
            menu();
            switch (luachon) {
                case 1:
                    Boolean check = dangnhap();
                if(check) {
                    System.out.println("Đăng nhập thành công");
                    adminMenu();
                    luachon = 0;
                    break;}
                    else {
                        System.out.println("Bạn có muốn tiếp tục không");
                    System.out.println("Nhấn phím 1 nếu muốn tiếp tục");
                    System.out.println("Nhấn phim 0 để quay lại mành hình chính");
                    int so = sc.nextInt();
                    if(so ==1) {
                        check =dangnhap();
                    } else if (so ==0) {
                        menu();
                    }
                }
                }


        } while (luachon != 0);

    }
}
