class MenggambarHastagZigzag {
	public static void main(String[] args) {

		// Program ini untuk menampilkan char #
		// dalam bentuk zigzag

		int a=5, k=6;
		for (int i=1;i<=a ;i++ )
		{
			System.out.print(" ");

			if (i%2==0) 
			{
				System.out.print("  #");
			}
			for (int j=1;j<=k ;j++ ) 
			{
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}