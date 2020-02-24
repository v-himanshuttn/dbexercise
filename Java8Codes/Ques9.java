package myjava8pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        //Collect all the even numbers from an integer list.
        List<Integer> li= Arrays.asList(1,2,3,4,6,7,8);
        System.out.println(
                li.stream()
                .filter(a->a%2==0)
                .collect(Collectors.toList()));

    }
}
