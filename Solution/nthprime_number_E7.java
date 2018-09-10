public class Solution{//2,3,5,7,11,13(6th prime) 1001th prime


// logic of prime
public static boolean prime(int n){
 boolean flag= true;
 if(n==0|| n==1){flag=false;return false;}   
 
 for(int i=2;i<=n/2;i++){
     
    if(n%i==0){
      flag= false;
       return false;
 }
 }  
    if(flag==true){return true;}

    return flag;
}
//1001th

public void nthPrime(int n){
 
int c= 4;

int number;
int count;
Solution a= new Solution();
for(number=2, count=0;count<n;number++){
    
    
    if(a.prime(number)){count++;
        // System.out.println(number);
    if(count==n){System.out.println("last is:"+ number);}
        
    }
    
    // if(count==c){
    //     System.out.println("last "+ number);
    // }
}
}

    public static void main(String[] args){
    Solution s= new Solution();
    s.nthPrime(10001);

    }
}