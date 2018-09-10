
import java.math.BigInteger;
public class E25
{    
private static int Fib(){
BigInteger b=new BigInteger("2");
BigInteger a=new BigInteger("1");

int index=0;

while(true){
BigInteger sum =a.add(b);
 a=b;
 b=sum;
 if(sum.toString().length()>1000) {break;}
 index++;
} 
return index;    
}

public static void main(String[] args){
    
int pm=Fib()-1;// according to base case     
System.out.println("count :"+pm);
}    
}   