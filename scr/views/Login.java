package scr.views;

import scr.Body.User;
import scr.Services.UserServices;
import scr.User1.Client;
import scr.User1.Employee;
import scr.User1.Manager;

import java.util.List;
import java.util.Scanner;

import static scr.ulti.getValue.getString;
import static scr.views.Adminview.adminMenu;
import static scr.views.Employeeview.EmployeeMenu;
import static scr.views.Register.dangky;

public class Login {
    static Scanner sc = new Scanner(System.in);
    static int luachon = 0;

    public static boolean dangnhap() {
        boolean trangthai = false;
        String userName = getString("nhập tài khoản");
        String passWord = getString("nhập mật khẩu");
        UserServices users = UserServices.getInstance();
        List<User> list = users.getUserList();
        for(User user : list) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(passWord) && user.getRole().equals("Quản lí")) {
                trangthai = true;
                adminMenu();
                break;
            }
            if(user.getUserName().equals(userName) && user.getPassword().equals(passWord) && user.getRole().equals("Nhân viên")){
                trangthai=true;
                EmployeeMenu();
                break;
            }
            if(user.getUserName().equals(userName) && user.getPassword().equals(passWord) && user.getRole().equals("Khách hàng")){
                trangthai=true;
                break;
            }
        }

        return trangthai;
    }


    public static void menu() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("\t\t CHÀO MỪNG BẠN ĐẾN VỚI PHẦN MỀM QUẢN LÍ");
        System.out.println("--------------------------------------------------\n");
        System.out.println("\t1. Đăng nhập");
        System.out.println("\t2. Đăng kí");
        System.out.println("\t0. Thoát chương trình");
        System.out.print("\n\tMời chọn chức năng: ");
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
                    Client newClient = dangky();
                    System.out.println("Đăng kí thành công.");
                    UserServices users = UserServices.getInstance();
                    users.addNewUser(newClient);
                    }break;
                default:
                    System.out.println("Bạn nhập kí tự không hợp lệ, mời nhập lại:");
                    menu();
                }

        } while (luachon != 0);
    }
}
