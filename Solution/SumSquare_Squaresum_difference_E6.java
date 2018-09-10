import java.lang.*;
public class Solution{//(1+2+3+)^2 -(1^2+2^2..)
    
public int sumSquare(int limit){
    int sum=0;
    
    for(int i=1; i<=limit;i++){
        sum+=i;
    }
    int output = (int) Math.pow(sum,2);
    
    return output;
}    

public int squareSum(int limit){
    
    int sum=0;
    for(int i=1; i<=limit;i++){
        sum= sum+(int) Math.pow(i,2);
        
    }

    return sum;
}    
    public static void main(String[] args){
    
    Solution s= new Solution();
    //System.out.println(s.squareSum(10));
    
      int p= s.sumSquare(100) - s.squareSum(100);
     System.out.println(p); 
        
    }
}