public class DP{

private static int WaysOfSummation(int n){
int D[]= new int[n+1];
D[0]=1;D[1]=1;D[2]=1;D[3]=2;

for(int i=4;i<=n;i++){
    
D[i]=D[i-1]+D[i-3]+D[i-4];
}
    
return D[n];    
    
}

public static void main(String[] args){


System.out.println("Answer is: " +WaysOfSummation(5));    
} 

}