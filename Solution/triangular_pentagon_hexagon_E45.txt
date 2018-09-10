public class E45  {
	
	public static void main(String[] args) {
	
		int p = 286;
		int q = 166;
		int r = 144;
		while (true) {
			long tri = (long)p * (p + 1) / 2;
			long pent = (long)q * (q * 3 - 1) / 2;
			long hex  = (long)r * (r * 2 - 1);
			long min = Math.min(Math.min(tri, pent), hex);
			if (min == tri && min == pent && min == hex){
				System.out.println(Long.toString(min));break;}
			if (min == tri) p++;
			if (min == pent) q++;
			if (min == hex ) r++;
		}
	}
	

}