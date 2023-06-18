package scr.views;

import static scr.ulti.getValue.getString;

public class Register {
    public static boolean dangky(){
        boolean trangthai1 = false;
        System.out.println("Mời nhập");
        String id = getString("Nhập họ và tên");
        String userName = getString("Nhập tên tài khoản: tài khoản gồm 8 kí tử lên và phải là chữ cái");
        String passWord = getString("Nhập mật khẩu: mật khẩu gồm 8 kí tự trở lên và vừa là số vừa là chữ");
        String dob = getString("Nhập ngày tháng năm sinh: phải là số");
        String address = getString("Nhập địa chỉ");
        String phone = getString("Nhập số điện thoại: gồm 10 chữ số");
        String gender = getString("Chọn giới tính: phải là 'male','female' hoặc 'nonbinary'");
        String literacy = getString("Trình độ học vấn");
        String  citizenIdentification = getString("Nhập căn cước công dân: gồm 12 chữ số");
        boolean user1 = Register.checkUser(userName);
        boolean pass1 = Register.checkPass(passWord);
        boolean dob1 =Register.checkDob(dob);
        boolean phone1 =Register.checkPhone(phone);
        boolean gender1 =Register.checkGender(gender);
        boolean citizenIdentification1 =Register.checkCitizenIdentification(citizenIdentification);
        if(user1 && pass1 && dob1 && phone1 && gender1 && citizenIdentification1){
//            if(user1){
            trangthai1 = true;
        }
        return trangthai1;
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
