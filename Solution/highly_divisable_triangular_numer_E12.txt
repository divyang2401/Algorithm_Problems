import java.lang.*;
public class Solution{
//1+2+3+4+5+6+7+8+9 
    
//one method triangle numbers
 void triangleNumbers(){ 

int p=0;
int i=0;
boolean flag= true;

while(flag){
    i++;
    p=p+i;//1    

 if(factorS(p)>500){System.out.println("500 factors number is: " + p);
        flag=false;
         break;
     }
}

}

//one method factorizing
static int factorS(int a){
int count=0;

for(int i=1;i<=Math.sqrt(a);i++){
if(a%i==0){    
count+=2;}
}
return count;
}

public static void main(String[] args)
{

Solution s= new Solution();
s.triangleNumbers();

}
}