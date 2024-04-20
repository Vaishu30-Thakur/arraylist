package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp= list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(4);
        System.out.println(list);
        //swap(list, 1, 3);
        //System.out.println(list);

        // sorting
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


    }
    
}
