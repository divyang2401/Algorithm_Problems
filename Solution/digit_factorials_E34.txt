public class E34{

 private static int factorial(int n){

  if(n>1) return n*factorial(n-1);
  else return 1;
 }   
    
private static boolean digitsAndCalculation(int a){//145
int b=a;
int sum=0;
int facts [] = new int[10];
for(int i=0;i<=9;i++){facts[i]=factorial(i);}

while(b>0){
int digit=b%10;
sum=sum+facts[digit];
b=b/10;
    
}    

if(sum==a){ 
return true;
}else
return false;
}   
    
public static void main(String[] args){
int result=0;

for(int i=10;i<2540161;i++){    
if(digitsAndCalculation(i)){
result+=i;    
}

}

 System.out.println(result);           
//  System.out.println(factorial(5));    
}    
    
}