package myjava8pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques10 {
    public static void main(String[] args) {

        //Sum all the numbers greater than 5 in the integer list.
        List<Integer> li= Arrays.asList(1,2,3,4,6,7,8);
        System.out.println("Sum is : "+
        li.stream()
                .filter(a->a>5)
                .mapToInt(Integer::intValue)
                .sum());

    }
}
