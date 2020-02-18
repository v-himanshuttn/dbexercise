public class Ques2duplicate {
    public static void main(String[] args) {
        String str="my name is my him name abc";
        String str1[]=str.split(" ");
        int count=0;
        for(int i=0;i<str1.length;i++)
        {
            count=0;
            inner:
            for(int j=0;j<str1.length;j++)
            {
                if(i>j && str1[i].equals(str1[j]))
                {
                        break inner;
                }
                if(str1[i].equals(str1[j]))
                {
                        count++;
                }
                if(j==str1.length-1) {
                        if(count>1) {
                            System.out.println(str1[i] + " occured " + count + " times");
                        }
                }
            }
        }
    }
}
