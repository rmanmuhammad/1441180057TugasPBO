public class TestMethodOverloading {
	public static int average(int nsatu, int ndua){  				//A
		return (nsatu+ndua)/2;
	}

	public static double average(double nsatu, double ndua){		//B
		return (nsatu+ndua)/2;
	}

	public static int average(int nsatu, int ndua, int ntiga){      //C
		return (nsatu+ndua+ntiga)/3;
	}

	public static void main(String[] args) {
		System.out.println(average(1, 2));			//use A
		System.out.println(average(1.0, 2.0));		//use B
		System.out.println(average(1, 2, 3));		//use C
		System.out.println(average(1.0, 2));		//use B

		// average (1, 2, 3, 4);
	}
}