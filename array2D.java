package arraylist;

import java.util.ArrayList;

public class array2D {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);
        list2.add(6); list2.add(7); list2.add(8); list2.add(9); list2.add(10);
        list3.add(11); list3.add(12); list3.add(13); list3.add(14); list3.add(15);
        mainList.add(list1); mainList.add(list2); mainList.add(list3);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curr=mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }
    
}
