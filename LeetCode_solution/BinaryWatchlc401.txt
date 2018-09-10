import java.util.*;
public class BinaryWatchlc401 {
     public static List<String> readBinaryWatch(int num) {
        ArrayList<String> result = new ArrayList<>();
         for (int i = 0; i < 12; i++) {
             for (int j = 0; j <60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == num) {
                    result.add(String.format("%d:%02d", i, j));
                }
             }
         }
        return result;
    } 
    public static void main(String[] args){
        List<String> list=readBinaryWatch(2);
        list.removeAll(Arrays.asList("", null));
        System.out.println(list);
    
        
    }
    
}