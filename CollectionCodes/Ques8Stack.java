package mycollection;

import java.util.Scanner;

class SpecialStack
{
    private int []mystack;
    private int top,size;

    public SpecialStack(int size)
    {
        mystack=new int[size];
        top=-1;
        this.size=size;
    }

    public int getTop()
    {
        return top;
    }

    //Get value of top[index]
    public int getTopVal()
    {
        return mystack[top];
    }

    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else {
        return false;
        }
    }


    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    //Print all element
    public void printAllElement()
    {
        System.out.println("Stack element is :");
        for(int i=top;i>=0;i--)
        {
            System.out.println(mystack[i]);
        }
    }

    //push element

    public void push(int ele)
    {
        if(isEmpty())
        {
            top=top+1;
            mystack[top]=ele;
        }
        else if(isFull())
        {

            System.out.println("Not inserted ! Already full");
        }
        else {
            top=top+1;
            mystack[top]=ele;
        }
    }

    //pop element
    public int pop()
    {
        int temp=0;
        if(isEmpty())
        {
            System.out.println("Stack empty");
        }
        else
        {
            temp=mystack[top];
            --top;
        }
        return temp;
    }


}
public class Ques8Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=0,val,choice=0;
        int minimum=10000;
        SpecialStack sstack=null;

        do {
            System.out.println("************* Stack Operation ************");
            System.out.println("Select your Choice");
            System.out.println("\n1:Push Element");
            System.out.println("\n2:Pop Element");
            System.out.println("\n3:Get top index");
            System.out.println("\n4:Get top element");
            System.out.println("\n5:Check stack is empty or not.");
            System.out.println("\n6:Check stack is full or not.");
            System.out.println("\n7:Print all stack element");
            System.out.println("\n8:GET MINIMUM ELEMENT IN O(1)");
            System.out.println("\n9:Exit");
            choice=sc.nextInt();

            if (choice == 9) {
                System.exit(1);
            }

            switch (choice) {
                case 1: {
                    System.out.println("Enter the size of stack");
                    len = sc.nextInt();
                    sstack = new SpecialStack(len);
                    System.out.println("Enter the elements for stack..");
                    for (int i = 0; i < len; i++)
                    {
                        val = sc.nextInt();

                        if(val<minimum)
                        {
                            minimum=val;

                        }
                        sstack.push(val);
                    }
                }
                break;

                case 2:

                    int gio=sstack.pop();
                    System.out.println("Poped element is :"+gio);
                    break;

                case 3:
                    int mytop=sstack.getTop();
                    System.out.println("Top is at index :"+mytop);
                    break;

                case 4:
                    int mytopval=sstack.getTopVal();
                    System.out.println("Top value is : "+mytopval);
                    break;

                case 5:
                    boolean mycheck=sstack.isEmpty();
                    if(mycheck==true)
                    {
                        System.out.println("Stack is empty..");
                    }
                    else
                    {
                        System.out.println("Stack is not empty");
                    }
                    break;
                  case 6:
                      boolean mychek=sstack.isFull();
                      if(mychek==true)
                    {
                          System.out.println("Stack is full..");
                      }
                      else
                      {
                          System.out.println("Stcak is not full");
                      }
                      break;
                case 7:
                    sstack.printAllElement();
                    break;
                case 8:
                    System.out.println("Minimum element is:"+minimum);
                            break;


                default:
                    System.out.println("wrong selection....");
            }

        }while (choice>0);


    }
}
