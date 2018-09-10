import java.math.*;
import java.lang.*;
import java.util.*;

public class E29{
 //a^b 2<=a<=5,2<=b<=5   
    
private static int printAll(int limit){    
int count=0;
  int start=2;
  
int finish=limit;//5
List<BigInteger> dp =new ArrayList<>();

for(int a=start;a<=limit;a++){
    for(int b=start;b<=limit;b++){


	BigInteger s= BigInteger.valueOf(a);
    BigInteger p = s.pow(b);   
    dp.add(p);    
}    
}    
Collections.sort(dp);

Set<BigInteger> withoutDuplicates= new LinkedHashSet<BigInteger>(dp);
dp.clear();
dp.addAll(withoutDuplicates);
for(BigInteger ab: dp){count++;}    
return count;
}

public static void main(String[] args){
int g= printAll(5);    
System.out.println(g);
}    
    
}