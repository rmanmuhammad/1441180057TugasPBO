//Muhammad Arif Rahman
//Segitiga

public class Segitiga {
	int tinggi;
	int alas;
	int sisi1;
	int sisi2;
	int sisi3;

	public void nilaiProperty() {
		System.out.println("Tinggi : " +tinggi);
		System.out.println("Alas   : " +alas);
		System.out.println("Sisi1  : " +sisi1);
		System.out.println("Sisi2  : " +sisi2);
		System.out.println("Sisi3  : " +sisi3);
	}
	public void ubahProperty(int tinggiInput, int alasInput, int sisi1Input, int sisi2Input, int sisi3Input){
		tinggi = tinggiInput;
		alas = alasInput;
		sisi1 = sisi1Input;
		sisi2 = sisi2Input;
		sisi3 = sisi3Input;
	}
	public int hitungLuas(){
		int luas;
		luas = (alas * tinggi) / 2;
		return luas;
	}
	public int hitungKeliling(){
		int keliling;
		keliling =  sisi1 + sisi2 + sisi3;
		return keliling;
	}
}