package scr.Body;

import java.util.Arrays;

public abstract class Menu {
    protected int id;
    protected String name;
    protected int price;
    protected int quantity;
    protected String[] detail;
    protected String status;

    public Menu() {
    }

    public Menu(int id, String name, int price, int quantity, String[] detail, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.detail = detail;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String[] getDetail() {
        return detail;
    }

    public void setDetail(String[] detail) {
        this.detail = detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "id: " + id +
                " name: " + name + "\n"+
                " price:" + price +"\n" +
                " quantity: " + quantity +"\n" +
                " detail: " + Arrays.toString(detail) + "\n" +
                " status: " + status + "\n"
                ;
    }
}
