public class E17{

    public static String[] ones = 
   { "","one","two","three","four","five","six","seven","eight","nine","ten",
      "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};//1-19
 
   public static String[] tens = 
   {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};//10,20..
 
   public static String[] hundreds = 
   {"","onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred",
      "sevenhundred","eighthundred","ninehundred"};
    
public static void main(String[]args){
    StringBuilder s1= new StringBuilder("");
    
    for(int i=1;i<=1000;i++){
    
    if(i<20){s1.append(ones[i]); }//System.out.println(ones[i]);}//ok
    if(i==1000){s1.append("onethousand"); /*System.out.println("onethousand");*/ break;}
    
    if(i>=20 && i<1000){
        //goes to ten and hundred
    int p=i;//100
    int divisor=10;
    StringBuilder s2 =new StringBuilder("");
    while(p/divisor>=10){divisor=divisor*10;}
    if(divisor==100){//545
        if(p%divisor==0){s2.append(hundreds[p/divisor]);/*System.out.println(hundreds[p/divisor]);*/}
    else if(p%divisor<=19){s2.append(hundreds[p/divisor]+"and" +ones[p%divisor]);
        //System.out.println(hundreds[p/divisor]+"and" +ones[p%divisor]);
    }

        else{
            int x=p%divisor;//x=45,p=545
            if(x%10==0){s2.append(hundreds[p/divisor]+"and" +tens[x/10]);}
            else{
            s2.append(hundreds[p/divisor]+tens[x/10]+"and"+ones[x%10]);
            }
        }
        String abc=s2.toString();
        s1.append(abc);
    }
    else{
    if(p%10==0){s1.append(tens[p/10]);}
    else{s1.append(tens[p/10]+ ones[p%10]);}    
    
    }
    }
    }
    
System.out.println(s1.length());    
    
    
    
    
}
}