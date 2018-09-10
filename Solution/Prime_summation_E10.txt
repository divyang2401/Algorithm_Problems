import java.lang.*;
public class Solution{

static boolean prime(int a){
boolean flag= true;    

if((a==0||a==1)|| (a>2 && a%2==0)){flag=false; return false;}

int top = (int)Math.sqrt(a);

for(int i=3;i<=top;i+=2){
if(a%i==0){flag=false; return false;}    

}    
 
 return flag;   
}
//2,3,5,7=17
public static long summationPrimes(long limit_number)//10 
{
    long sum=0;
    for(int i=2;i<=(int)limit_number;i++){
    
        if(prime(i)){
            sum+=i;
        }
    }
    return sum;
}

public static void main(String[] args){
long p= summationPrimes(2000000);
System.out.println(p);
    
    
    
}    
}