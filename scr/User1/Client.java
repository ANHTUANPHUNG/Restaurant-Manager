package scr.User1;

import scr.Body.User;

public class Client extends User {

    private String order;
    private String assessment;

    public Client(int id, String userName, String password, String dob, String address, long phone, String gender, String literacy, long citizenIdentification, String role, String typeAccount, String order, String assessment) {
        super(id, userName, password, dob, address, phone, gender, literacy, citizenIdentification, role, typeAccount);
        this.order = order;
        this.assessment = assessment;
    }

    public Client(int id, String userName, String password, String dob, String address, long phone, String gender, String literacy, long citizenIdentification, String role, String typeAccount) {
        super(id, userName, password, dob, address, phone, gender, literacy, citizenIdentification, role, typeAccount);
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "order='" + order + '\'' +
                ", assessment='" + assessment + '\'' +
                '}';
    }
}
