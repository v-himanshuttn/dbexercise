package javapart2;

public class Ques3a {
    public static void main(String[] args) {

        //This is example of class not found Exception

        try
        {
            Class.forName("kamal");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
