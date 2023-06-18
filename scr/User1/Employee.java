package scr.User1;

import scr.Body.User;

public class Employee extends User {
    private int salary ;
    private String deletaDishes;
    private String addDishes;
    private String joinTables; //gộp bàn
    private String moveTable; // chuyển bàn
    private int timeKeeping;

    public Employee(int id, String userName, String password, String dob, String address, int phone, String gender, String literacy, long citizenIdentification, String role, String typeAccount) {
        super(id, userName, password, dob, address, phone, gender, literacy, citizenIdentification, role, typeAccount);
        this.salary=salary;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public String getJoinTables() {
        return joinTables;
    }

    public void setJoinTables(String joinTables) {
        this.joinTables = joinTables;
    }

    public String getMoveTable() {
        return moveTable;
    }

    public void setMoveTable(String moveTable) {
        this.moveTable = moveTable;
    }

    public int getTimeKeeping() {
        return timeKeeping;
    }

    public void setTimeKeeping(int timeKeeping) {
        this.timeKeeping = timeKeeping;
    }


}
