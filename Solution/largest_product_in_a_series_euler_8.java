import java.lang.*;
public class Solution{
    
static final String NUMBERS="73167176531330624919225119674426574742355349194934969835203127745063262395783180169848018694788518438586156078911294949545950173795833195285320880551112540698747158523863050715693290963295227443043557668966489504452445231617318564030987111217223831136222989342338030813533627661428280644448664523874930358907296290491560440772390713810515859307960866427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";


//n=4 ; value=5832

final static int n=13;


public static void main(String[] args){

long maxProduct=1;

for(int i=0;i<=NUMBERS.length()-n;i++){
    // as last (n-1) numbers can't be completed through i
    
    long product=1;
    
    for(int j=i;j<i+n;j++){
        product = product *(NUMBERS.charAt(j)-'0');
    //System.out.println(product);
    }
    
    maxProduct =Math.max(product,maxProduct);
}
//7*3*1*6
System.out.println("Max product is: " +maxProduct);







}
}