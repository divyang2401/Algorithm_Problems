public class E36{
    
private static String binaryConversion(int n){    

StringBuilder str= new StringBuilder(""); 
 while(n>0){
  str.append(Integer.toString(n%2));
    n=n/2;
 }   
String p= str.toString();
// System.out.println(p);
return p;
}   

private static int decimalConversation(String n){
  String a=n;
  int sum=0;
  for(int i=0;i<a.length();i++){
      sum+=(a.charAt(i)-'0')*((int)Math.pow(2,(i)));
      //System.out.print(a.charAt(i)-'0') ;
  }
 return sum;
}

private static boolean isPalindrome(int n, String p){
boolean flag=false;
//decimal palindrome
int sum=0;
int temp=n;
while(n>0){
    sum=(sum*10)+(n%10);
    n=n/10;
}
if(temp==sum){flag= true;}
else  return false;

// binary palindrome

for(int i=0;i<p.length();i++){
if((p.charAt(i))==(p.charAt(p.length()-1-i))){
flag=true;}
else return false;
}
return flag;
}    

public static void main(String[] args){    
long final_sum=0;
for(int i=999999;i>0;i=i-2){
    String result=binaryConversion(i);
    int n =decimalConversation(result);
    if(isPalindrome(n,result))
    {final_sum+=n;}
    
    
}

System.out.println(final_sum);    
}    

}