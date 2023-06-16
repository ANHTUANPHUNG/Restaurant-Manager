package scr.Body;

public class Orderonline {
    private String book;
    private String detailBill;
    private String addressClient;
    private String delivery;


    public Orderonline(String book, String detailBill, String addressClient, String delivery) {
        this.book = book;
        this.detailBill = detailBill;
        this.addressClient = addressClient;
        this.delivery = delivery;
    }

    public String getBook() {
        return book;
    }

    public String getDetailBill() {
        return detailBill;
    }

    public String getAddressClient() {
        return addressClient;
    }
    public String getDelivery(){
        return delivery;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setDetailBill(String detailBill) {
        this.detailBill = detailBill;
    }

    public void setAddressClient(String addressClient) {
        this.addressClient = addressClient;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "Orderonline{" +
                "book='" + book + '\'' +
                ", detailBill='" + detailBill + '\'' +
                ", addressClient='" + addressClient + '\'' +
                ", delivery='" + delivery + '\'' +
                '}';
    }
}
