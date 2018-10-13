//check permutation
/*2 methods:1)Sorting charcters and matching characters
            2)Save(count++) each characters in array and match arrays 
*/
public class checkPermutation{
private static String sort(String s){
char[] content= s.toCharArray();    
java.util.Arrays.sort(content);
return new String(content);
}

private static boolean checkPermutationBySorting(String a, String b){
if(a.length()!=b.length()){return false;}
    
return sort(a).equals(sort(b));    
    
}    
private static boolean checkPermutationByArray(String a, String b){    
/*
if(a.length()!=b.length()){return false;}
int[] aarray =new int[128];
int[] barray =new int[128];
for(int v=0;v<a.length();v++){
    aarray[a.charAt(v)]++;
}    
  int counter=0;
for(int j=0;j<b.length();j++){barray[b.charAt(j)]++;}    
  for(int t=0;t<128;t++){if((aarray[t]==barray[t]) && aarray[t]>0){counter++;}}
  System.out.println(counter);
if(counter==a.length()){return true;}
else return false;
}*/
if(a.length()!=b.length()){return false;}
 
 int[] letters=new int[128]; 
 char[] a_array=a.toCharArray();
  for(char c:a_array){letters[c]++;} 
  for(int i=0;i<b.length();i++){
   int c=(int)b.charAt(i);
    letters[c]--;
    if(letters[c]<0){return false;}
  }
return true;
}
public static void main(String[] args){    

String p="aba";
String q="ba";
System.out.println(checkPermutationBySorting(p, q));
System.out.println(checkPermutationByArray(p, q));
}    
}
