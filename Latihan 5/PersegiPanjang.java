//Muhammad Arif Rahman
//Persegi Panjang
public class PersegiPanjang
{
	int panjang;
	int lebar;

	public void cetakKeLayar()
	{
		System.out.println("Panjang: " + panjang);
		System.out.println("Lebar: " + lebar);
	}

	public  void ubahProperty(int panjangBaru, int lebarBaru)
	{
		panjang = panjangBaru;
		lebar = lebarBaru;
	}

	public int hitungLuas()
	{
		int luas;
		luas = panjang * lebar;
		return luas;
	}

	public int hitungKeliling()
	{
		int keliling;
		keliling = 2 * (panjang + lebar);
		return keliling;
	}
}