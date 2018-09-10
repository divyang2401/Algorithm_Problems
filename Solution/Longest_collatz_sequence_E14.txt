public class E14{
 
 static int longestCS(){

  
  int maxcount=0;
  int out=0;
  
for(int i=10;i<1000000;i++){
 long n=i; // it must be long, because of arithmatic operations 
  int count=1;
  while(n>1){
    count++;
    if(n%2==0){  n=n/2; }
 else{ n=3*(n)+1;}
   }
 
if(count>maxcount){out=i;maxcount=count;}
}   
 System.out.println("mAXcount: "+ maxcount);  
return out; 
 }
 public static void main(String[] args){
int p=longestCS();
   System.out.println("number is:" +p);
 }
 
 }
    