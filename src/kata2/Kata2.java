package kata2;

import java.util.HashMap;

public class Kata2 {
    public static void main (String[]args){
       //Integer [] vector = {1,4,7,1,1,8,4,1,4,9};
       //Double [] vector = {1.1,1.2,1.1,2.2,3.2};
       String [] vector = {"Pedro","Pedro","Juan","Dani","Marco","Dani"};
       
       Histogram<String> histogram = CalculateHistogram.computeHistogram(vector);
       
        for (Object key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
