public class Ques6twice {
    public static void main(String[] args) {
        int[] ele = {2, 4, 5, 2, 4,3,7,7,3};
        int c;
        for (int i = 0; i < ele.length; i++)
        {
            c=0;
            for (int j = 0; j < ele.length; j++)
            {
                if (ele[i] == ele[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.println("That single element is:"+ele[i]);

            }


        }
    }
}

