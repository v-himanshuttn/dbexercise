package barista;

public class OrderQueue {
    //Order queue can be implement using array datastructure, 1 flag means order is placed and set value 1 and inserted
    // every time whenever the order is recevied.
    //After ready the order the flag 1 (means order plced) is set to 0 by index.
    // index indicate the sequence of order.

    //For better we can use the ArrayList (Collection) for maintaining the order queue.

    //I am assuming that 100 times will placed
    int size=100;
    int []orderqueue=new int[size];

    public int[] getOrderQueue()
    {
        //it return the whole orderqueue to check how many order is completed and how many is pending.
        return orderqueue;
    }
    public void setOrderQueue(int tokenId)
    {
        //this method is called every time when order is placed and Cashier placed order in order Queue.
        //On each access to this method the value is set 1 in new index.
    }


}
