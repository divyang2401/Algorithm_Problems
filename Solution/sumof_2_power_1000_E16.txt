import java.math.*;


public class E16{

public static void main(String[] args){
// 2^1000--> bi1=2, bi2=0, bi3=10 // number=2^1000//
BigInteger bi1= new BigInteger("2");
BigInteger bi2= new BigInteger("0");
BigInteger bi3= new BigInteger("10");
BigInteger number= bi1.pow(1000);
BigInteger result=new BigInteger("0");

while(number.compareTo(bi2)==1){
    result= result.add((number.remainder(bi3)));
    number=number.divide(bi3);
}
System.out.println(result);
}
}
// define 2,0,10

/*
n=2^1000;
while(n>1)
{
    result=result+(n%10);
    n=n/10;
}
*/