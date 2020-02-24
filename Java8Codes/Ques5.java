package myjava8pack;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {

        //Consumer
        System.out.println("----------  Consumer ----------------");
        Consumer c=(a)->{
            System.out.println("I want square of number and print it :"+(int)a*(int)a);

        };
        c.accept(2);


        System.out.println("----------  Supplier ----------------");
        //Supplier

        Supplier s=()->{
            return "Hi i am supplier";
        };
        System.out.println(s.get());

        System.out.println("----------  Predicate ----------------");
        Predicate<Integer> predicate=(a)->a%2==0;
        System.out.println("Test :"+predicate.test(4));

        System.out.println("----------  Function ----------------");
        Function<Integer,Integer> f=(a)->a*2;
        System.out.println("Square of number :"+f.apply(3));


    }
}
