public class LC190 {    
    
public int reverseBits(int n) {//11:00000000000000000000000000001011
  int result = 0;
  for (int i = 0; i < 32; ++i) {
    result = result<<1  | (n & 1);
    n >>>= 1;
  }
return result;  }
    
}