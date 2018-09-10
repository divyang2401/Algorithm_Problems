
import java.util.*;
import java.lang.*;
import java.math.*;
public class E20{
    
private static BigInteger factorial(BigInteger n){
BigInteger t= new BigInteger("1");  
if((n.compareTo(t))==1){return ((n).multiply(factorial(n.subtract(t)))); }
else return t;
    
}

private static BigInteger sumDigits(String digits){
 BigInteger result= BigInteger.ZERO;
  for(int i=0;i<digits.length();i++){
    result= result.add(BigInteger.valueOf(digits.charAt(i)-'0'));
 
 }
 return result;
    
}

public static void main(String[] args){

BigInteger p=sumDigits(factorial(new BigInteger("100")).toString());
System.out.println(p);

}

}