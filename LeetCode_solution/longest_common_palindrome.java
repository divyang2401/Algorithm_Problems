{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Riched20 10.0.17134}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 public class HelloWorld\{\par
\par
//odd length center\par
//even length center\par
\par
public static String longestPalindromeString(String s)\{\par
    \par
    //base case for checking ..\par
    if(s==null || s.length()==1)\par
        return s;\par
    \par
    //variable to track maximum length    \par
    int maxLen=1;//String from here is more than 1 length\par
    String result=s.substring(0,1);\par
    \par
    //String travese\par
    for(int i=0;i<s.length()-1;i++)\{\par
        \par
        //odd length checking\par
        String a=helper(s,i,i);\par
        if(a.length()>maxLen)\{\par
            maxLen=a.length();\par
            result=a;\par
        \}\par
        \par
        //even length checking\par
        String b= helper(s,i,i+1);//in even there are two centers\par
        if(b.length()>maxLen)\{\par
            maxLen=b.length();\par
            result=b;\par
        \}\par
        \par
    \}\par
    return result;\par
\}\par
\par
public static String helper(String s, int i, int j)\{\par
    \par
while(i>=0 && j<=s.length()-1 && s.charAt(i)==s.charAt(j))\{\par
    i--;\par
    j++;\par
\}\par
    \par
 return s.substring(i+1,j);   \par
\}\par
\par
     public static void main(String []args)\{\par
        System.out.println("Hello World");\par
        System.out.println(longestPalindromeString("BANANA"));\par
     \}\par
\}\par
}
 