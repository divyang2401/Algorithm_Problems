public class Lc191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {//19:0001 0011
      int counter=0;
        for(int i=0;i<32;i++){
          if((n&1)>0){counter++;}
          n>>>=1;
      }  
        System.out.println(counter);
        return counter;
    }
}// push number right and multiply with 1 and if it is one(greater than 0) increment counter.