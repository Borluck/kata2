package kata2;

import java.util.HashMap;

public class Kata2 {
    public static void main (String[]args){
       int [] vector = {1,4,7,1,1,8,4,1,4,9};
       
       HashMap<Integer,Integer> histogram = new HashMap<>();
       
        for (int key : vector){
            if(histogram.containsKey(key)){
                histogram.put(key, histogram.get(key)+1);
            }else{
                histogram.put(key, 1);
            }
        }
        for (int key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
