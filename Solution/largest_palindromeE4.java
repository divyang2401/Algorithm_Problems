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
    int n=3;
   
    
    int upper_limit=0;
    int lower_limit=0;
    
    for(int i=1;i<=n;i++){
        upper_limit*=10;
        upper_limit+=9;
    }
//  System.out.println(upper_limit);
 
 lower_limit= 1+ upper_limit/10;


int max_product=0;
//  System.out.println(lower_limit);

 for(int i= upper_limit; i>=lower_limit;i--){
 
 for(int j=i;j>= lower_limit;j--){
    int p=i*j;

    //if(palindrome(p)){System.out.println(i +" "+ " just palindrome :"+ j);}
    
    if(palindrome(p) && p>max_product){
        max_product=p;         
   // System.out.println(i+" "+j + " " +p );
 }
  
 }
  }
 
 
 System.out.println(max_product);
 
    }
}