package scr.views;

import scr.Services.UserServices;

import java.util.Scanner;

import static scr.ulti.getValue.getString;
import static scr.views.Adminview.adminMenu;
import static scr.views.Register.dangky;

public class Login {
    static Scanner sc = new Scanner(System.in);
    static int luachon = 0;

    public static boolean dangnhap() {
        boolean trangthai = false;
        String userName = getString("nhập tài khoản");
        String passWord = getString("nhập mật khẩu");
        UserServices users = new UserServices();
        if (userName.equals(users.userName) && passWord.equals(users.passWord)) {
            trangthai = true;
        }
        return trangthai;
    }
    public static void EmployeeMenu() {
        System.out.println("Chào mừng nhân viên yêu quý");
        System.out.println("1. Chọn món");
        System.out.println("2. Quản lí thực phẩm");
        System.out.println("3. Quản lí khách hàng");
        System.out.println("0. Trở về trang đăng nhập");
        System.out.println("Mời chọn chức năng:");
    }

    public static void menu() {
        System.out.println("Chào mừng bạn đến với phần mềm quản lí:");
        System.out.println("1. Đăng nhập ");
        System.out.println("2. Đăng Kí ");
        System.out.println("0. Thoát chương trình ");
        System.out.println("Mời chọn chức năng:");
        luachon = sc.nextInt();
        sc.nextLine();
    }
    public static void main(String[] args) {
        do {
            menu();
            int count =0;
            switch (luachon) {
                case 1: {
                    System.out.println("Mời nhập");
                    boolean checkLogIn = dangnhap();
                    while (true) {
                        if (checkLogIn) {
                            System.out.println("Đăng nhập thành công");
                            adminMenu();
                            luachon = 0;
                            break;
                        } else {
                            System.err.println("Sai tài khoản hoặc mật khẩu" + (count + 1) + "!!!");
                            System.out.println("Bạn có muốn tiếp tục không");
                            System.out.println("Nhấn phím 1 nếu muốn tiếp tục");
                            System.out.println("Nhấn phim 0 để quay lại mành hình chính");
                            int so = sc.nextInt();
                            if (so == 1) {
                                checkLogIn = dangnhap();
                                count++;
                            } else if (so == 0) {
                                break;
                            }
                        }
                        if (count == 4) {
                            System.err.println("bạn đã nhập sai 5 lần, xin quay lại vào lần sau.");
                            break;
                        }
                    }
                }break;
                case 2: {
                    boolean checkRegister = dangky();
                    while (true) {
                        if (checkRegister) {
                            System.out.println("Đăng kí thành công");
                            luachon = 0;
                            UserServices users = new UserServices();
//                            users.addNewUser(checkRegister);
                            break;
                        } else {
                            System.err.println("Tài khoản đăng kí không hợp lệ lần" + (count + 1) + "!!!");
                            System.out.println("Bạn có muốn tiếp tục không:");
                            System.out.println("Nhấn phím 1 nếu muốn tiếp tục");
                            System.out.println("Nhấn phim 0 để quay lại mành hình chính");
                            int so = sc.nextInt();
                            if (so == 1) {
                                checkRegister = dangky();
                                count++;
                            } else if (so == 0) {
                                break;
                            }
                        }
                        if (count == 4) {
                            System.err.println("bạn đã nhập sai 5 lần, xin quay lại vào lần sau.");
                            break;
                        }
                    }
                }break;
            }
        } while (luachon != 0);
    }
}
