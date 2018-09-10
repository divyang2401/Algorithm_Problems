import java.util.*;
public class Solution{

public int powers(int c, int limit){
    //2,10
    int b=c;
int n;
    while(limit>=b)// 10>=4,10>
    {
        b*=c;// b= 2*2, 4*2=8
    }
    return (b/c);
}

public int divisable(int upper_limit){
    int lower_limit=1;
    // int product=1;
    int x=1;
ArrayList<Integer> primeNumbers= new ArrayList<>();
// find prime numbers between lower_limit to upper_limit
// divisable by 1-10 is 2520
Solution s= new Solution();
for(int i=1;i<upper_limit;i++){
if(s.primes(i)){
 primeNumbers.add(i);   
}
}
for(int k: primeNumbers){
    
int y= powers(k,upper_limit);
    x*=y;
    // System.out.println(x);
    // product*=k;
}
// System.out.println(product);
System.out.println(x);
return x;
}

//2,3,5,7,9: 2^3,3^2
boolean primes(int a){
boolean flag=true;
if(a==0 || a==1){/*System.out.println("Not a prime");*/flag=false;
return false;}
for(int i=2; i<=a/2;i++){
while(a%i==0){
    // System.out.println("Not a prime");
    flag=false;
    return false;
    
    }    
    }
if(flag=true){/*System.out.println("prime");*/ return true;}

return flag;
}

public static void main(String[] args){
Solution p = new Solution();
 int b= p.divisable(20);   
// int a= p.powers(2,10);
// System.out.println(a);
    
}
}