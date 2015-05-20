//Test Persegi Panjang
//Muhammad Arif Rahman
public class TestPersegiPanjang {
	public static void main(String[] args)
	{
		PersegiPanjang bangunku = new PersegiPanjang();
		
		bangunku.panjang = 100;
		bangunku.lebar = 25;
		bangunku.cetakKeLayar();

		System.out.println("Luas: " + bangunku.hitungLuas());

		bangunku.ubahProperty(500, 300);

		System.out.println("Property baru:");

		bangunku.cetakKeLayar();		


		System.out.println("Luas baru: " + bangunku.hitungLuas());
	}
}