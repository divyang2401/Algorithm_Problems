//how many ways can we earn dollor?
import java.lang.*;
public class Solution{
    
 private static long byteLandtoDollar(long n, long m){   
    if(n<m){return n;}
        
    
  return (Math.max(n,(byteLandtoDollar(n/2,m)+byteLandtoDollar(n/3,m)+byteLandtoDollar(n/4,m))));   
 }    
// return(Math.max(n,find(n/2)+find(n/3)+find(n/4)));
    
public static void main(String[] args){    
    long n=12;
    long p=byteLandtoDollar(n,n);
    System.out.println(p);


    
    
}    
}