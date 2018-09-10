class Solution {
    public int reverse(int x) {//123
        String p= Integer.toString(x);
        StringBuilder str= new StringBuilder("");
        for(int i=p.length();i>0;i--){
            str.append(i);
        }
        String j=str.toString();
        
        int a= Integer.parseInt(j);
        
     
        return a;
       // int n=x; 
       // int divisor=1;
       //  while(n>10){
       //      divisor*=10;
       //      n=n/10;
       //  }
       //  int p=(x%10)*divisor+((x/10)%10)*(divisor/10)+(x/divisor);
       //  //123, 3*100+(2)
       //  return p;
    }
}