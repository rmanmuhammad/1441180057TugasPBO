class TestLaptop{
	public static void main(String[] args) {
	//ini instansiasi objek 
		//namaClass namaObjek = namaKonstruktor
		Laptop arif = new Laptop();
		Laptop rahman = new Laptop("Toshiba","Pink");
		Laptop mirtha = new Laptop("Apple","Doreng","Terputus");
		Laptop dhyla = new Laptop("Alienware","Merah Hitam","Terhubung",90);

		arif.menyala();
		System.out.println("Laptopnya arif : Merk ="+arif.getMerk()+"Warna = "+arif.getWarna()+"Wifi ="+arif.getWifi()+"Baterai"+arif.getBaterai());
		arif.indikatorBaterai();
		arif.indikatorWifi();
		rahman.menyala();
		System.out.println("Laptopnya rahman: Merk ="+rahman.getMerk()+"Warna = "+rahman.getWarna()+"Wifi ="+rahman.getWifi()+"Baterai"+rahman.getBaterai());
		rahman.mati();
		rahman.indikatorBaterai();
		rahman.indikatorWifi();
		mirtha.menyala();
		System.out.println("Laptopnya mirtha : Merk ="+mirtha.getMerk()+"Warna = "+mirtha.getWarna()+"Wifi ="+mirtha.getWifi()+"Baterai"+mirtha.getBaterai());
		mirtha.mati();
		mirtha.indikatorBaterai();
		mirtha.indikatorWifi();
		dhyla.menyala();
		System.out.println("Laptopnya dhyla : Merk ="+dhyla.getMerk()+"Warna = "+dhyla.getWarna()+"Wifi ="+dhyla.getWifi()+"Baterai"+dhyla.getBaterai());
		dhyla.mati();
		dhyla.indikatorBaterai();
		dhyla.indikatorWifi();

		//setter
		System.out.println("Setelah Setter");
		arif.setMerk("Macbook"); arif.setWarna("Hijau"); arif.setWifi("Terputus"); arif.setBaterai(100);
		arif.menyala();
		System.out.println("Laptopnya arif : Merk = "+arif.getMerk()+"Wifi = "+arif.getWifi()+"Baterai ="+arif.getBaterai());
		arif.indikatorBaterai();
		arif.indikatorWifi();
		arif.mati();
		dhyla.setBaterai(100);
		dhyla.menyala();
		System.out.println("Laptopnya dhyla : Merk = "+dhyla.getMerk()+"Wifi = "+dhyla.getWifi()+"Baterai ="+dhyla.getBaterai());
		dhyla.indikatorBaterai();
		dhyla.indikatorWifi();
		dhyla.mati();
}	}
