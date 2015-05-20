//Test Bangunan 
//segitiga
//lingkaran
public class TestBangun {
	public static void main(String[] args) {
		Segitiga bangunku = new Segitiga();
		Lingkaran punyaku = new Lingkaran();
		System.out.println("::::::::::>>>>>> SEGITIGA <<<<<::::::::::::");
		bangunku.tinggi = 11;
		bangunku.alas = 4;
		bangunku.sisi1 = 6;
		bangunku.sisi2 = 5;
		bangunku.sisi3 = 4;

		bangunku.nilaiProperty();

		System.out.println("Luas : " +bangunku.hitungLuas());
		System.out.println("Keliling : "+bangunku.hitungKeliling());		

		System.out.println("\n");

		System.out.println(":::::::::::>>>>> LINGKARAN <<<<::::::::::");
		punyaku.jejari = 7;
		punyaku.nilaiProperty();

		System.out.println("Luas : " +punyaku.hitungLuasLingkaran());
		System.out.println("Keliling : "+punyaku.hitungKelilingLingkaran());
	}
}