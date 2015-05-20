//Muhammad Arif Rahman
//ini LIngkaran 
public class Lingkaran{
	int jejari;

	public void nilaiProperty(){
		System.out.println("Jari-jari : "+jejari);
	}
	public void ubahProperty(int jejariInput){
		jejari = jejariInput;
	}
	public double hitungLuasLingkaran(){
		double luas;
		luas = Math.PI * jejari * jejari;
		return luas;
	}
	public double hitungKelilingLingkaran(){
		double keliling;
		keliling = Math.PI * 2 * jejari;
		return keliling;
	}
}