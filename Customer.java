package barista;

public class Customer {
    private String customerName,orderName,statusforOrder;
    private int tokenId,waitingTimeforToken,waitingTimeforOrder;
    private double paidAmount;

    public Customer() {
    }

    public Customer(String customerName, String orderName, double paidAmount) {
        this.customerName = customerName;
        this.orderName = orderName;
        this.paidAmount = paidAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getStatusforOrder() {
        return statusforOrder;
    }

    public void setStatusforOrder(String statusforOrder) {
        this.statusforOrder = statusforOrder;
    }

    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    public int getWaitingTimeforToken() {
        return waitingTimeforToken;
    }

    public void setWaitingTimeforToken(int waitingTimeforToken) {
        this.waitingTimeforToken = waitingTimeforToken;
    }

    public int getWaitingTimeforOrder() {
        return waitingTimeforOrder;
    }

    public void setWaitingTimeforOrder(int waitingTimeforOrder) {
        this.waitingTimeforOrder = waitingTimeforOrder;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    //The total time taken for getting the token
    public void timeForToken()
    {

    }

    //The total time taken for getting order ready
    public void timeForOrder()
    {

    }
}
