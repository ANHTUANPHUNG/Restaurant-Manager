package scr;

import scr.Body.Menu;
import scr.Services.DishesServices;
import scr.User1.Client;
import scr.User1.Employee;
import scr.User1.Manager;
import scr.Services.UserServices;

public class Restaurant {
    public static void main(String[] args) {
        Manager batuyet = new Manager(1,"batuyet123","batuyet1","5/5/1995","120 Điện Biên Phủ",0123456,"Nữ","giáo sư facebook kiêm nhà chiêm tinh học kiêm nhà bình luận học kiêm biết tuốt",345349234,"Quản lí","VIP");
        Employee quangtuan = new Employee(2,"quangtuan","quangtuan3","1995","155 Điện Biên Phủ",12456,"nam","đại học",345349234,"nhân viên","medium");
        Client anhtuan = new Client(3,"anhtuan","anhtuan2","1997","172 khúc thừa dụ",1245612,"nam","12/12",345349234,"khách hàng","medium");
        UserServices users = new UserServices();

        users.addNewUser(batuyet) ;
        users.addNewUser(quangtuan);
        users.addNewUser(anhtuan);
        System.out.println(users.getUserList().toString());
        users.removeUser(2);
        System.out.println(users.getUserList().toString());

        Menu comhen = new Menu(1,"cơm hến",10000,10, new String[]{"tóp", "cơm", "rau", "hến", "gia vị"},"còn lại 3");
        Menu banhcanh = new Menu(2,"banh canh",10000,10, new String[]{"tóp", "cơm", "rau", "hến", "gia vị"},"còn lại 3");
        Menu ga = new Menu(3,"cơm hến",10000,10, new String[]{"tóp", "cơm", "rau", "hến", "gia vị"},"còn lại 3");
        DishesServices menus = new DishesServices();
        menus.addDishesMenu(comhen);
        menus.addDishesMenu(banhcanh);
        menus.addDishesMenu(ga);
        System.out.println(menus.getDishesMenu().toString());
        menus.removeUser(2);
        System.out.println(menus.getDishesMenu().toString());
    }
}
