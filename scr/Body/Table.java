package scr.Body;

public class Table {
    private String tableNumber;
    private String status;

    public Table(String tableNumber, String status) {
        this.tableNumber = tableNumber;
        this.status = status;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber='" + tableNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
