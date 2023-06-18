package scr.User1;

import scr.Body.User;

public class Manager extends User {
    private int salary;
    private int timeKeeping;// chấm công

    private String deleteEmployee;
    private String addEmployee;
    private String deletaDishes;
    private String addDishes;
    private String changRole; // thay đổi vai trò
    private String assessment; //đánh giá

    public Manager(int id, String userName, String password, String dob, String address, long phone, String gender, String literacy, long citizenIdentification, String role, String typeAccount, int salary) {
        super(id, userName, password, dob, address, phone, gender, literacy, citizenIdentification, role, typeAccount);
        this.salary = salary;

    }

    public Manager(int id, String userName, String password, String dob, String address, long phone, String gender, String literacy, long citizenIdentification, String role, String typeAccount) {
        super(id, userName, password, dob, address, phone, gender, literacy, citizenIdentification, role, typeAccount);
    }

    public Manager(int id, String sad, String number, String number1, String number2, int phone, String number3, String number4, String number5, String number6, String hashtag) {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTimeKeeping() {
        return timeKeeping;
    }

    public void setTimeKeeping(int timeKeeping) {
        this.timeKeeping = timeKeeping;
    }

    public String getDeleteEmployee() {
        return deleteEmployee;
    }

    public void setDeleteEmployee(String deleteEmployee) {
        this.deleteEmployee = deleteEmployee;
    }

    public String getAddEmployee() {
        return addEmployee;
    }

    public void setAddEmployee(String addEmployee) {
        this.addEmployee = addEmployee;
    }

    public String getDeletaDishes() {
        return deletaDishes;
    }

    public void setDeletaDishes(String deletaDishes) {
        this.deletaDishes = deletaDishes;
    }

    public String getAddDishes() {
        return addDishes;
    }

    public void setAddDishes(String addDishes) {
        this.addDishes = addDishes;
    }

    public String getChangRole() {
        return changRole;
    }

    public void setChangRole(String changRole) {
        this.changRole = changRole;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }


}
