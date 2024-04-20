package arraylist;

import java.util.ArrayList;

public class Intro {
    public static void printList(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }

    public static void printReverse(ArrayList list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5,8);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(3);
        list.set(2,6);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(8));
        printList(list);
        printReverse(list);
    }
    
}
