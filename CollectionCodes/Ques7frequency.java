package mycollection;

import java.util.*;
import java.util.Map.Entry;

//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency
// then print the one which came first.
public class Ques7frequency {

    static void sortMapByValue(TreeMap<Integer, Integer >m) {

        //LinkedList used Insertion order preserved
        List<Entry<Integer, Integer>> ll = new LinkedList<>(m.entrySet());
        Collections.sort(ll, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                if (o1.getValue() > o2.getValue())
                    return -1;
                else if (o1.getValue() < o2.getValue())
                    return 1;
                else
                    return 0;
            }
        });

        //  System.out.println("safsafsdf"+ll);
        System.out.println("After Sorting: ");
        for (Entry entry : ll) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Insert element in TreeMap

        TreeMap<Integer, Integer> tm=new TreeMap<Integer, Integer>();
        for(int a: arr) {
            if (tm.containsKey(a)) {
                tm.put(a, tm.get(a) + 1);
            } else
                tm.put(a, 1);
        }

        System.out.println("Before Sorting: ");
        for (Entry entry : tm.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        sortMapByValue(tm);
    }

 }
