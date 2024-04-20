package arraylist;

import java.util.ArrayList;

public class Complex {

    //container with most water
    //brute force method
    // public static int mostWater(ArrayList<Integer> height){
    //     int max=0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int minHeight=Math.min(height.get(i), height.get(j));
    //             int width=j-i;
    //             int trappedWater=minHeight*width;
    //             max=Math.max(max,trappedWater);
    //         }
    //     }
    //     return max;
    // }

    //2 pointer method
    public static int mostWater(ArrayList<Integer> height){
        int max=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int minHeight=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int trappedWater=minHeight*width;
            max=Math.max(max,trappedWater);
            if(lp<rp){
                lp++;
            }else{
                rp++;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(mostWater(height));
        
    }
    
}
