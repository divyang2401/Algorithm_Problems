import java.lang.*;

public class Solution{
    
    
    
static void primeFactors(long n){
        
    while(n%2==0){
        System.out.println(2 +" ");
        
        n=n/2;
    }        
    
    long p=n;
    // now n is odd
    for(int i=3;i<=Math.sqrt(p);i++){
        
        while(n%i==0){
            
            System.out.println(i+" ");
            n=n/i;
        }
        
    }

    }
    
    public static void main(String[] args){
        
    primeFactors(600851475143L);    

        
    }
}