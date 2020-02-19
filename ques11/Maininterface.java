package barista;

public class Maininterface {
    public static void main(String[] args) {

        //Take the customer information like customer name ,ordername which is coffee and amount

        System.out.println("Enter the customer");
        System.out.println("Enter order name");
        System.out.println("Pay amount for coffee");

        //So here first create the object of customer and stores this information in customer object.
        //We can enclosed in loop this for multiple customer.

        Customer c1=new Customer();

        //Now the Customer and Cashier is interact via Communication class
        //and pass the information to the cashier and cashier set the information in customer object.

        //Now get the token
        c1.getTokenId();

        //Waiting time for token
        c1.getWaitingTimeforToken();

        //creating object of communication class
        Communication comm=new Communication();

        //check the status of order
        comm.getOrderStatus();

        //Get the ready  notification for order
        comm.lastNotification();

    }
}
