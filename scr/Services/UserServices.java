package scr.Services;
import scr.Body.User;
import scr.User1.Client;
import scr.User1.Employee;
import scr.User1.Manager;

import java.util.ArrayList;
import java.util.List;

public class UserServices {
    static int idcurrent;
    List<User> userList = new ArrayList<>();
//    dùng phương pháp singleton: lí do sử dụng phương pháp này là để chỉ sử dụng chung 1 lớp duy nhất,
//    nếu muốn sử dụng thì chỉ cần gọi nó ra bằng cách userServices.getInstance
//    tạo biến private static để thể hiện rằng n là lớp duy nhất
    private static UserServices instance;
//sử dụng hàm public static
    public static  UserServices getInstance() {
        if(instance == null) {
            instance  = new UserServices();
        }
        return instance;
    }
//    phải sử dụng private để bắt buộc người dùng phải sử dụng qua hàm getInstance để gọi tới UserServices
    private UserServices() {
        Manager batuyet = new Manager(++idcurrent,"tuyetnguyen","tuyettuyet1","5/5/1995","120 Điện Biên Phủ",0123456,"Nữ","giáo sư facebook kiêm nhà chiêm tinh học kiêm nhà bình luận học kiêm biết tuốt",345349234,"Quản lí","VIP");
        Employee quangtuan = new Employee(++idcurrent,"quangtuan","quangtuan3","1995","155 Điện Biên Phủ",12456,"nam","đại học",345349234,"Nhân viên phục vụ","medium");
        Client anhtuan = new Client(++idcurrent,"anhtuan","anhtuan2","1997","172 khúc thừa dụ",1245612,"nam","12/12",345349234,"Khách hàng","medium");
        userList.add(batuyet) ;
        userList.add(quangtuan);
        userList.add(anhtuan);
    };



    public List<User> getUserList() {
        return userList;
    }

    public void addNewUser(User user){
        userList.add(user);
    }
    public void removeUser(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                break;
            }
        }
    }
        public void updateUser(int id, User updatedUser) {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getId() == id) {
                userList.set(i, updatedUser);
                break;
            }
        }
    }
    public User getUserById(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

}
