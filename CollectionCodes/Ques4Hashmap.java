package  mycollection;
import java.util.Comparator;
import java.util.*;
import java.util.List;
import java.util.Map.Entry;

public class Ques4Hashmap {


    static void printMap(HashMap <Integer, String >m) {
        for (Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
    static void sortMapByValue(HashMap<Integer, String >m){
        List<Entry<Integer, String >> ll=new LinkedList(m.entrySet());
        Collections.sort(ll, new Comparator<Entry<Integer, String >>() {
            @Override
            public int compare(Entry<Integer, String > o1, Entry<Integer,  String > o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });


        System.out.println("After Sort by Value");

        System.out.println("key  Value");
        HashMap<Integer, String> sortedMap = new LinkedHashMap();
        for (Entry<Integer, String> entry : ll)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        printMap(sortedMap);
    }


    public static void main(String[] args) {

        HashMap<Integer, String > hm=new HashMap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        int r=0;
        String s=null;
        System.out.println("enter student roll and name for "+n+" students:");
        for(int i=0;i<n;i++){
            r=sc.nextInt();
            sc.nextLine();
            s=sc.nextLine();

            hm.put(r,s);
        }
        System.out.println("Before sort");
        System.out.println("key Value");
        printMap(hm);
        sortMapByValue(hm);

    }
}
