package myjava8pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques11 {
    public static void main(String[] args) {

        //Find average of the number inside integer list after doubling it.

        List<Integer> li= Arrays.asList(1,2,3,4);
        System.out.println("Average average of the number inside integer list after doubling it : "+
        li.stream()
                .map(a->a*2)
                .collect(Collectors.averagingInt(a->a)));

//                .collect(Collectors.averagingInt(a->a*2)));
    }
}
