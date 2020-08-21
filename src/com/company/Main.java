package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String>a = new ArrayList<>();
        ArrayList<String>b = new ArrayList<>();
        ArrayList<String>c = new ArrayList<>();
        Iterator<String>iteratorA;
        Iterator<String>iteratorB;

        addArrayList(a,5);
        sout(a);
        System.out.println("--------------");
        addArrayList(b,5);
        sout(b);
        System.out.println("---------------");

        Collections.reverse(b);
        iteratorA=a.iterator();
        iteratorB=b.iterator();

        while (iteratorA.hasNext()&& iteratorB.hasNext()){
            c.add(iteratorA.next());
            c.add(iteratorB.next());

        }
        sout(c);
        System.out.println("---------------");
        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1 , String o2) {
                if(o1.length()< o2.length()){
                    return -1;
                }else if(o1.length()>o2.length()){
                    return 1;
                }else return 0;
            }
        });
        sout(c);
    }

    private static void addArrayList(ArrayList<String>collection,int element){
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i <element ; i++) {
            System.out.println("Add next element");
            collection.add(scanner.nextLine());

        }
    }

    private static void sout (ArrayList<String>arrayList){
        Iterator<String>iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
