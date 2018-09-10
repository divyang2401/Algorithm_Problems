public class E39 {
    
public static void main(String[] args) {
 
 long resultOfSolution =0;
 long result=0;

 for(long p=2;p<=1000;p+=2){
 int ways=0;
    for(long a=2;a<(p/3);a++){
        if(p*(p-2*a) % (2*(p-a)) == 0){
            ways++;
        }
    }
if(ways>resultOfSolution){
    resultOfSolution=ways;
    result=p;

 }
}
System.out.println("number of Solutions is :" +resultOfSolution + " perimeter is: "+result);
}
}