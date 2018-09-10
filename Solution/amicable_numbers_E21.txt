public class E21{
    
private static int factorSum(int n){    
int sum=1;
int limit=(int)Math.sqrt(n);
for(int i=2;i<=limit;i++){

if(n%i==0){sum+=i;
    int d=n/i;
    if(d!=i){sum+=d;}
}

}    
  return sum;  
}

public static void main(String[] args){    
int suma=0;

 for(int i=2;i<=10000;i++){

int p= factorSum(i);//284==p 

if(i==factorSum(p) && i!=p){suma=suma+i;
    System.out.println(i + " "+ p);
}
    
 }
System.out.println("final output :"+suma);
}


}