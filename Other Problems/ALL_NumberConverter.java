import java.util.HashMap;
import java.util.Map;

public class NumberSystem{

  public static <K,V> K getKey(Map<K,V>map, V value){
    for(Map.Entry<K,V> entry: map.entrySet()){
      if(value.equals(entry.getValue())){
        return entry.getKey();}}
  return null;
  }
 private static HashMap<Integer, Character> hmap= new HashMap<Integer, Character>();
  static{
hmap.put(10,'A');
hmap.put(11,'B');
hmap.put(12,'C');
hmap.put(13,'D');
hmap.put(14,'E');
hmap.put(15,'F');
}

//decimal to binary, decimal to Hexa, decimal to octal with fraction
private static String ConverterL(double t, int base){
  double fraction;
 if(t==Math.round(t)){
  fraction=0;}
  else{fraction=(t-Math.floor(t));} 
  System.out.println("fraction part is:"+fraction);
StringBuilder output = new StringBuilder();    
int n=(int)(t-fraction);
 while(n>0){
if((n%base)>10){    
output.append(hmap.get(n%base));}
else{output.append(n%base);}
n=n/base;
} 
StringBuilder fractionOutput = new StringBuilder("");      
 double a=fraction; 
if(fraction>0){
  int i=0;
  while(i!=6){
    if(base==16){if(a*base>=10.0){fractionOutput.append(hmap.get((int)(a*base)));}
                 else{fractionOutput.append((int)Math.floor(a*base));}}             
    if(base==2){if(a*base>=1){fractionOutput.append(1); }
                else{fractionOutput.append(0);}}
if(base==8){fractionOutput.append((int)Math.floor(a*base));}

    a=(a*base)-(Math.floor(a*base));
        if(a==1.00 || a==0.00){break;} 
  i++;
  }
} 
  output=output.reverse();
  output.append(".");
  output.append(fractionOutput.toString());
return output.toString();    
}

private static String ConverterH(String b, int base){// other bases to decimal
String[] p=b.split("\\.");
 String n=p[0];
  System.out.println("number is: "+n);
String fraction=p[1];
  System.out.println("fraction is: "+fraction);
int flength=fraction.length();  
int length=n.length();
int sum=0;
double fsum=0;

StringBuilder xyz= new StringBuilder(n);
xyz= xyz.reverse();//CBA
int i=0;
int j=0;
while(i<length)
{
 int a=(int)(xyz.charAt(i)-'0');    
if(a>10){a=getKey(hmap,xyz.charAt(i));}    
sum+=(a)*Math.pow(base,i);
i++;
}
while(j<flength)
{
 int c=(int)(fraction.charAt(j)-'0');    
if(c>10){c=getKey(hmap,fraction.charAt(j));}    
fsum+=(c)*Math.pow(base,((j+1)*(-1)));
j++;
}
double k= (double)sum+fsum;
return Double.toString(k);
}

public static void main(String[] args){   
int iB=16;
int oB=10;
int iN=0;
String iNs="ABC";
// decimal to octal
// if(inputBase>outputBase){// decimal to other base
//System.out.println(ConverterL(0.16,8)); /*} 
//else{// other base to Decimal*/
    System.out.println(ConverterH("1010.00101",2)); //} 
    
    }
}