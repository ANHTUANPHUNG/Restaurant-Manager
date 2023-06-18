package scr.Body;

public abstract class User {
    protected int id ;
    protected String userName;
    protected String password;
    protected String dob ;
    protected String address;
    protected long phone;
    protected String gender;
    protected String literacy; //trình độ
    protected long citizenIdentification; //cccd
    protected String role ; //vai trò

    protected String typeAccount;

    public User(int id, String userName, String password, String dob, String address, long phone, String gender, String literacy, long citizenIdentification, String role, String typeAccount) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.literacy = literacy;
        this.citizenIdentification = citizenIdentification;
        this.role = role;

        this.typeAccount = typeAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public long getCitizenIdentification() {
        return citizenIdentification;
    }

    public void setCitizenIdentification(long citizenIdentification) {
        this.citizenIdentification = citizenIdentification;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public User() {
    }

    @Override
    public String toString() {
        return
                "id: " + id + "\n"+
                " tên đăng nhập: " + userName  +"\n"+
                " mật khẩu: " + password  +"\n"+
                " ngày sinh:" + dob  +"\n"+
                " địa chỉ:" + address  +"\n"+
                " số điện thoại:" + phone +"\n"+
                " giới tính:" + gender  +"\n"+
                " trình độ học vấn:" + literacy  +"\n"+
                " mã căn cước:" + citizenIdentification +"\n"+
                " chức vụ:" + role  +"\n"+
                " loại tài khoản:" + typeAccount +"\n"  ;
    }
    }
