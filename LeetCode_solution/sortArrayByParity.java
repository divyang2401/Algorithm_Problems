public class Main{
public static int[] sortParity(int[] a){
    int[] b=a;
 for(int i=0;i<a.length;i++){   
 if(a[i]%2==0){   
for(int j=0;j<i;j++){
if(a[j]%2==0){continue;}  
else{swap(j,i,a);break;}}     
 }
 else{
     continue;
 }
    
 }
return b; 
}
public static int[] swap(int x,int y, int[] a){
int d=a[x];
a[x]=a[y];
a[y]=d;

return a;    
} 
    
    public static void main(String[] args){
    int s[]= new int[]{3,1,2,4};
    int o[]=sortParity(s);
    for(int i=0;i<o.length;i++){
        System.out.println(o[i]);
    }
    }
    
    
}
/*Brute force approach*/


/*Improved approach*/
class Solution {
public int[] sortArrayByParity(int[] a) {
int i=0; 
while(i<a.length){   
 if(a[i]%2==0){   
for(int j=0;j<i;j++){
if(a[j]%2==0){continue;}  
else{swap(j,i,a);break;}}     
   i++;  }
else{i++;}   
 }
return a; 
}
public static int[] swap(int x,int y, int[] a){
int d=a[x];
a[x]=a[y];
a[y]=d;

return a;    
}        
    
}

/*Online Method*/
public static int[] sortArrayByParity(int[] a) {
for(int i=0,j=0;j<a.length;j++){
    if(a[j]%2==0){
    int temp=a[i];
    a[i++]=a[j];
    a[j]=temp;
    }
}
return a;
}
