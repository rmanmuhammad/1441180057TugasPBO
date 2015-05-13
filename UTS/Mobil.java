// Muhammad Arif Rahman
// 1441180057 */
class Mobil extends Kendaraan {
	private int KecepatanMaks;
	private int JumlahRoda;
	Kendaraan mob = new Kendaraan();
	public Mobil(int InputKecepatanMaks, int InputBerat, int InputKapasitas, int InputJumlahRoda){

		KecepatanMaks 	= InputKecepatanMaks;
		Berat 			= InputBerat;
		Kapasitas 		= InputKapasitas;
		JumlahRoda 		= InputJumlahRoda;
	}

	public void CetakSpesifikasi()
	{
		System.out.println("Kecepatan Maks Kendaraan: " +mob.Kendaraan());
		System.out.println("Kecepatan Maks Mobil: " +KecepatanMaks);
		System.out.println("Berat Mobil: " +Berat);
		System.out.println("Kapasitas Mobil: " +Kapasitas);
		System.out.println("Jumlah Roda Mobil: " +JumlahRoda);
	}

	public void Jalankan(int Kecepatan)
	{
		System.out.println("Mobil dijalankan dengan kecepatan: " +Kecepatan);
	}
}