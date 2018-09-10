//11011101111: 1775

public class FlipBit{
    
 private static int flippingBit(int n){   
int max_sequence=1;
int current_sequence=0;
int prev_sequence=0;

while(n!=0){
if((n&1)==1){    
    current_sequence++;
}
else if((n&1)==0){    
prev_sequence=((n&2)==0)? 0:current_sequence;
current_sequence= 0;   
}    
max_sequence=Math.max(prev_sequence+current_sequence+1,max_sequence);
    n=n>>>1;
}    
  return max_sequence;
 }    
    
    
public static void main(String[] args){
System.out.println(flippingBit(1775));
    
}    
}