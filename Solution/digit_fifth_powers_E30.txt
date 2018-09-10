public class E30{
    

public static void main(String[] args){    
    int totalSum=0;
for(int i=300000;i>1;i--){    //max digit power is 9^5=59049, so there is min 5 digits can be ocuur
int divisors=10;// so, if there is five times 9, so 5*9^5=295245 so, round of 300000
int sum=0;
int b=i;
while(b!=0){
    int a= b%10;
    sum=sum+(int)Math.pow(a,5);
    b=b/10;
}    
sum+=(int)Math.pow(b,5);
if(sum==i){System.out.println(i);totalSum+=i;}
} 
  System.out.println("totalSum is: "+totalSum);
}
}