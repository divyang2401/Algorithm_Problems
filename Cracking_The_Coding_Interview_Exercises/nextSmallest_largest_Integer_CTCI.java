/* 
011-->101
0110-->1001
0111-->1011
011000-->1000001
01110-->10011

*/
public class nextInt{
    
 private static int getNextLarger(int x){   
int smallest,ripple,ones;        
smallest=(x&(x*(-1)));    
ripple=x+smallest;
ones=x^ripple;
ones=(ones>>2)/smallest;
return ripple| ones;
 }    
 
 private static int getNextSmaller(int n){
     return ~getNextLarger(~n);
 }
    
public static void main(String[] args){    
System.out.println(getNextLarger(11));    
System.out.println(getNextSmaller(11));        
    
}    
}