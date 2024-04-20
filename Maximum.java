package arraylist;

import java.util.ArrayList;

public class Maximum {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(4);

        int max=Integer.MIN_VALUE;
        /*for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }*/
        for(int i=0;i<list.size();i++)
        {
        max= Math.max(max, list.get(i));
        }
        System.out.println("maximim number="+ max);
    }
    
}
