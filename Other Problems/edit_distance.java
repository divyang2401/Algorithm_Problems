public class EditDistance {
    
private static int[][] tableFormation(String str1, String str2){    
 int str1Length= str1.length();
 int str2Length= str2.length();
 int T[][] = new int[str1Length+1][str2Length+1];
 
 for(int i=0;i<=str1Length;i++){
     for(j=0;j<=str2Length;j++){
        if(i==0){
        T[i][j]=j;   
        } 
        if(j==0){
        T[i][j]=i;    
        }
     
        if(str1[i]==str2[j]){
        T[i][j]= T[i-1][j-1];    
        } 
        else{
            T[i][j]= Math.min(T[i-1][j],T[i-1][j-1],T[i][j-1])+1;
        }
         
     }
 }   
 return T[str1Length][str2Length] ;  
}    
    
    
    
public static void main(String[] args){    
String str1 ="abcdef";
String str2= "azced";
System.out.println(tableFormation(str1,str2)); 
    
    
    
    
    
    
}    
}
