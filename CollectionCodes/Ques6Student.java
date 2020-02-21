package mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student{
    String name;
    Double Age;
    Double Score;
    Student(String n, Double s, Double a){
        this.name=n;
        this.Score=s;
        this.Age=a;
    }
    public String toString(){
        return name+"    "+Score+"      "+Age;
    }
}
class CompareByScore implements Comparator<Student> {
    public int compare(Student e1, Student e2){
        if(e1.Score>e2.Score)
            return -1;
        else if(e1.Score<e2.Score)
            return 1;
        else
            return new NameComparator().compare(e1, e2);
    }
}
class NameComparator implements Comparator<Student> {
    public int compare(Student e2, Student e1){
        return e2.name.compareTo(e1.name);
    }
}



public class Ques6Student {
    public static void main(String[] args) {
            ArrayList<Student> ar=new ArrayList<Student>();
            ar.add(new Student("mike",20.0, 24.0));
            ar.add(new Student("pagar",25.0, 22.0));
            ar.add(new Student("munna",34.0, 25.0));
            ar.add(new Student("amisha",34.0, 21.0));
            ar.add(new Student("Aishika",32.0, 11.0));
            ar.add(new Student("lohit",21.0, 18.0));
            ar.add(new Student("neha", 33.0, 20.0));
            Collections.sort(ar, new CompareByScore());
            for(int i=0;i<ar.size();i++){
                System.out.println(ar.get(i));
            }
        }
}