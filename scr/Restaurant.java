package scr;

import scr.Body.Menu;
import scr.Services.DishesServices;
import scr.User1.Client;
import scr.User1.Employee;
import scr.User1.Manager;
import scr.Services.UserServices;

public class Restaurant {
    public static void main(String[] args) {
        Manager batuyet = new Manager(1,"tuyetnguyen","tuyettuyet1","5/5/1995","120 Điện Biên Phủ",0123456,"Nữ","giáo sư facebook kiêm nhà chiêm tinh học kiêm nhà bình luận học kiêm biết tuốt",345349234,"Quản lí","VIP");
        Employee quangtuan = new Employee(2,"quangtuan","quangtuan3","1995","155 Điện Biên Phủ",12456,"nam","đại học",345349234,"nhân viên","medium");
        Client anhtuan = new Client(3,"anhtuan","anhtuan2","1997","172 khúc thừa dụ",1245612,"nam","12/12",345349234,"khách hàng","medium");
        UserServices users = new UserServices();
        users.addNewUser(batuyet) ;
        users.addNewUser(quangtuan);
        users.addNewUser(anhtuan);
//        System.out.println("Thông tin của các người dùng:");
//        System.out.println(users.getUserList().toString());
        Manager update = new Manager(1,"3534","345","435","34534",34543534,"34534","43534",435345,"34534","34534");
        users.updateUser(1,update);
        System.out.println(users.getUserList());
        users.removeUser(2);
        System.out.println(users.getUserList());
//        System.out.println(users.getUserList().toString());
//        Menu as = new Menu(1,"545",54,54, new String[]{"đá", "sadsa"},"324");
//        Menu bs = new Menu(1,"545",54,54, new String[]{"353", "3534"},"54");
//        DishesServices uss = new DishesServices();
//        uss.addDishesMenu(as);
//        uss.addDishesMenu(bs);
//        System.out.println(uss.getDishesMenu().toString());
    }
}
