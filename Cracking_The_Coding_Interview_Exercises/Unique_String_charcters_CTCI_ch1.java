//unique characters in a String
public class UniqueString{
/* Three methods:
1) Comparison of each characters in a String using two for loop 
2)Create boolean array and saved each character values 
3)Bitwise manipulation(32 bits)(0-31 special characters after charAt()-'a') 
 */   
private static boolean checkingStringBit(String a){    
 //3)bitwise   
int checker=0;
for(int i=0;i<a.length();i++){
 int value=a.charAt(i)-'a';   
 if((checker & (1<<value))>0){
    return false;
}   
checker=checker|(1<<value); 
}   
return true;    
}   
private static boolean checkingStringBool(String a){
boolean checker[] =new boolean[128];
for(int i=0;i<a.length();i++){
char val=a.charAt(i);
if(checker[val]){
    return false;
}
checker[val]=true;
}
return true;    
}
public static void main(String[] args){    
String p="abcdef";
System.out.println(checkingStringBit(p));
System.out.println(checkingStringBool(p));    
    
    
    
    
    
}    
}