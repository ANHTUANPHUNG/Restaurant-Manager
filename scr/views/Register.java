package scr.views;

import scr.Body.User;
import scr.Services.UserServices;
import scr.User1.Client;

import java.util.List;

import static scr.ulti.getValue.getString;
import static scr.views.Login.menu;

public class Register {
    public static Client dangky(){
        System.out.println("Mời nhập:");
        String id = getString("Nhập họ và tên:");
        String userName = getString("Nhập tên tài khoản: tài khoản gồm 8 kí tử lên và phải là chữ cái:");
        UserServices users = UserServices.getInstance();
        List<User> list = users.getUserList();
        boolean condition = false;

        while (true){ //&& !userName.equals("0")) {
            for (User user : list) {
                if (user.getUserName().equals(userName)) {
                    condition = true;
                    break;
                }
            }
            if (condition) {
                System.err.println("Tài khoản đã tồn tại:");
                System.out.println("0. Nếu bạn muốn quay lại màn hình chính.");
                userName = getString("Nhập tên tài khoản nếu bạn muốn tiếp tục: tài khoản gồm 8 kí tự lên và phải là chữ cái:");
//                if (userName.equals("0") ) {
//                    menu();
//                    break;
//                }

            } else if (!checkUser(userName)) {
                System.err.println("Tài khoản không hợp lệ:");
                System.out.println("0. Nếu bạn muốn quay lại màn hình chính.");
                userName = getString("Nhập lại tên tài khoản: tài khoản gồm 8 kí tự lên và phải là chữ cái:");
            } else {
                break;
            }
        }
        String passWord = getString("Nhập mật khẩu: mật khẩu gồm 8 kí tự trở lên và vừa là số vừa là chữ:");
        while (true){
            if(!checkPass(passWord)){
                System.err.println("Mật khẩu không hợp lệ:");
                passWord = getString("Nhập lại mật khẩu: mật khẩu gồm 8 kí tự lên và phải là chữ cái:");
            } else {
                break;
            }
        }
        String dob = getString("Nhập ngày tháng năm sinh: phải là số:");
        while (true){
            if(!checkDob(dob)){
                System.err.println("Ngày sinh không hợp lệ:");
                dob = getString("Nhập lại ngày sinh: ngày sinh  phải là số:");
            } else {
                break;
            }
        }
        String address = getString("Nhập địa chỉ:");
        String phone = getString("Nhập số điện thoại: gồm 10 chữ số:");
        while (true){
            if(!checkPhone(phone)){
                System.err.println("Số điện thoại không hợp lệ:");
                phone = getString("Nhập lại số điện thoại: số điện thoại gồm 10 chữ số:");
            } else {
                break;
            }
        }
        String gender = getString("Chọn giới tính: phải là 'male','female' hoặc 'nonbinary':");
        while (true){
            if(!checkGender(gender)){
                System.err.println("Giới tính không hơp lệ :");
                gender = getString("Nhập lại giới tính: giới tính phải là 'male','female' hoặc 'nonbinary'");
            } else {
                break;
            }
        }
        String literacy = getString("Trình độ học vấn:");
        String  citizenIdentification = getString("Nhập căn cước công dân: gồm 12 chữ số:");
        while (true){
            if(!checkCitizenIdentification(citizenIdentification)){
                System.err.println("Căn cươc công dân không hợp lệ:");
                citizenIdentification = getString("Nhập lại số căn cước công dân: căn cước công dân gồm 12 chữ số:");
            } else {
                break;
            }
        }
        Client c = new Client();
        c.setUserName(userName);
        c.setPassword(passWord);
        c.setDob(dob);
        c.setPhone(Long.parseLong(phone));
        c.setGender(gender);
        c.setCitizenIdentification(Long.parseLong(citizenIdentification));
        return c;

    }
//    check tên đăng nhập
    public static boolean checkUser(String userName) {
        boolean isletter = false;
        for (char i : userName.toCharArray()) {
            if (Character.isLetter(i)) {
                isletter = true;
            }
        }
        boolean isNumber = false;
        for (char i: userName.toCharArray()) {
            if(Character.isDigit(i)){
                isNumber = true;
            }
        }
        return !isNumber && isletter && userName.length() >= 8;
    }
//check mk
    static boolean checkPass(String password) {
        boolean isnumber = false;
        for (char i : password.toCharArray()) {
            if (Character.isDigit(i)) {
                isnumber = true;
            }
        }
        boolean isletter = false;
        for (char i : password.toCharArray()) {
            if (Character.isLetter(i)) {
                isletter = true;
            }
        }
        return isletter && isnumber && password.length() >= 8;
    }
//check dob
    static boolean checkDob(String dob) {
        boolean isnumber = false;
        for (char i : dob.toCharArray()) {
            if (Character.isDigit(i)) {
                isnumber = true;
            }
        }
        boolean isletter = false;
        for (char i : dob.toCharArray()) {
            if (Character.isLetter(i)) {
                isletter = true;
            }
        }
        return isnumber && !isletter;
    }
// check sdt
    static boolean checkPhone(String phone) {
        boolean isnumber = false;
        for (char i : phone.toCharArray()) {
            if (Character.isDigit(i)) {
                isnumber = true;
            }
        }
        boolean isletter = false;
        for (char i: phone.toCharArray()) {
            if(Character.isLetter(i)){
                isletter=true;
            }
        }
        return !isletter && isnumber && phone.length() == 10;
    }
//check giới tính
    static boolean checkGender(String gender) {
        String[] gender1 = {"male", "female", "nonbinary"};
        for (String element : gender1) {
            if (gender.equals(element))
                return true;
        }
        return false;
    }
//    check cccd
    static boolean checkCitizenIdentification(String citizenIdentification){
        boolean isnumber = false;
        for (char i : citizenIdentification.toCharArray()) {
            if (Character.isDigit(i)) {
                isnumber = true;
            }
        }
        boolean isLetter = false;
        for (char i : citizenIdentification.toCharArray()){
            if(Character.isLetter(i)){
                isLetter=true;
            }
        }
        return !isLetter  && isnumber && citizenIdentification.length() == 12;
    }

}
