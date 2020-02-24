package myjava8pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques12 {
    public static void main(String[] args) {

        //Using stream
        //first even number in the integer list which is greater than 3.

        List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(li.stream()
                .filter(a->a%2==0)
                .filter(a->a>4)
                .findFirst()
                );


    }
}
