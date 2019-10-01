public class Main
{/*Online approach*/
    public static int[] countBits(int num){
        int[] a= new int[num+1];
        a[0]=0;
        for(int i=1;i<=num;i++){
        if(i%2!=0){
            a[i]=a[i-1]+1;
        } else{
          a[i]=a[i >> 1];
        }
        
        }
    
        return a;
    }
    
	public static void main(String[] args) {
		int op[]=countBits();
		for(int i=0;i<op.length;i++){
		    System.out.println(op[i]);
		}
	}
}
