package kata2;

import java.util.HashMap;

public class Kata2 {
    public static void main (String[]args){
       int [] vector = {1,4,7,1,1,8,4,1,4,9};
       
       Histogram histo = new Histogram(vector);
       
       HashMap<Integer,Integer> histogram = histo.getHistogram();
       
       
        for (int key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
