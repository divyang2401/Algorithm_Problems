import java.lang.*;
public class Solution{
    
static int a;
static int b;
static int c;

static int product;    
    
public static void main(String[] args){

// find a*b*c for a<b<c and a2+b2=c2 and a+b+c=1000 ; a=1 to 1000; b= a to 1000;
    
    for(a=1; a<1000;a++){
    
    for(b=a+1; b<1000;b++){
        
    c=1000-a-b;
    if((Math.pow(c,2))==((Math.pow(b,2))+(Math.pow(a,2)))){
    product= a*b*c;    
    System.out.println(product);        
    }
    }    
        
        
    }
    
    
}    
    
    
    
    
    
    
    
    
    
}