import java.lang.*;

public class Solution{
    
    
    
static boolean palindrome(int n){
    
    int divisor=1;
    while(n/divisor>=10)
        {
            divisor*=10;
        }// divsor 
        
    while(n!=0){//9119
    
    int last;
    int first;
    
    last= n%10; // 9
    first= n/divisor;//9
    
    
    if(last!= first){
        return false;
    }
    
    // removing these digits from the number
    n=(n%divisor)/10; // divisor=1000
    
    divisor= divisor/100;
    
    }
    return true;
    
    }
    
    static void factors(int p){
        int divisor=10;
        
        while(p/divisor>=100){
            divisor*=10;
        }//9009..900>10, divisor=100;9009
        
        int a;
         int count=0;
        
        for(int i=divisor; i>=1;i--){
        
        if(p%i==0){
            a=i;
            System.out.println(a +" ");
        
            count+=1;
        }    
        
        if(divisor==100 && count==2){
            break;
        }
        }
    }
    
    public static void main(String[] args){
        
    if(palindrome(9009)){
        factors(9009);
    }    
    else
    System.out.println("No palindrome!");

        
    }
}