package scr.Body;

public class Bill {
    private String tableNumber;
    private String cashier;
    private String inTime;
    private String outTime;
    private String detailBill;

    public Bill(String tableNumber, String cashier, String inTime, String outTime, String detailBill) {
        this.tableNumber = tableNumber;
        this.cashier = cashier;
        this.inTime = inTime;
        this.outTime = outTime;
        this.detailBill = detailBill;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public String getCashier() {
        return cashier;
    }

    public String getInTime() {
        return inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public String getDetailBill() {
        return detailBill;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public void setDetailBill(String detailBill) {
        this.detailBill = detailBill;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "tableNumber='" + tableNumber + '\'' +
                ", cashier='" + cashier + '\'' +
                ", inTime='" + inTime + '\'' +
                ", outTime='" + outTime + '\'' +
                ", detailBill='" + detailBill + '\'' +
                '}';
    }
}
