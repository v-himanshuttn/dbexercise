public class Ques5Common {
    public static void main(String[] args) {

        //Find Common element in two array

        int [] ele1={1,2,-1,3};
        int [] ele2={1,1,4,2,2,9,4,6,-1};
        int c=0;
        for(int i=0;i<ele1.length;i++)
        {
            for (int j=0;j<ele2.length;j++)
            {
                if(ele1[i]==ele2[j])
                {
                    System.out.println(ele1[i]+" ");
                    for(int k=0;k<ele2.length;k++)
                    {
                        if(ele2[k]==ele1[i])
                        {
                            ele2[k]=-0;
                        }
                    }
                    break;
                }


            }
        }
    }
}
