import java.lang.*;
import java.util.*;
public class E35{
 
 private static boolean isPrime(long a){
boolean flag= true;    

if((a==0||a==1)|| (a>2 && a%2==0)){flag=false; return false;}

long top = (int)Math.sqrt(a);

for(long i=3;i<=top;i+=2){
if(a%i==0){flag=false; return false;}    

}    
 
 return flag;   
}

private static long circulationOfNumbers(long p, long d, int multi){
    long ap=0;
    int multiplier=1;
    boolean flag=true;
    long a=p;
    
    while(a>10){
         multiplier*=10;
    a=a/10;
    }

long digit=(p%10)*multiplier+(p/10);
if(isPrime(digit)){    
if(multi<=1){flag=false;}
while(flag){
if(digit==d || p%10==2 || p%10==5){break;}
       ap= digit;
      flag=false;
        //  System.out.println(digit+" :: "+ multi);
}
return ap;}
else return 0;
}

static List<Long> finalOutput= new ArrayList<>();    

public static void main(String[] args){//197
 for(long i=100;i<=1000000;i++){
// long i=3777;
if(isPrime(i)){
long a=i;
int multiplier=1;
while(a>10){
         multiplier*=10;
    a=a/10;
    }
List<Long> dp= new ArrayList<>();
dp.add(i);
long pp=i;
while(multiplier>=10){    
   pp=circulationOfNumbers(pp,i, multiplier);
//   System.out.println(pp);
  if(pp==0){break;} else{dp.add(pp);}
multiplier= multiplier/10;
}     
// System.out.println(dp.size());
int counter=13;
if(i>=100 && i<1000 && dp.size()==3){finalOutput.add(i); counter++;}
if(i>=1000 && i<10000 && dp.size()==4){finalOutput.add(i); counter++;}
if(i>=10000 && i<100000 && dp.size()==5){finalOutput.add(i); counter++;}
if(i>=100000 && i<1000000 && dp.size()==6){finalOutput.add(i); counter++;}

}
}
System.out.println(finalOutput.size()+13);
System.out.println(finalOutput);
}
    
}