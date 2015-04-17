class testMobil {
	public static void main(String[] args) {
		mobil dhylla = new mobil();


		System.out.println("Ini Mobil dhylla");
		System.out.println("merk		=" +dhylla.getmerk());
		System.out.println("platNomor	=" +dhylla.getplatNomor());
		System.out.println("warna 		=" +dhylla.getwarna());
		System.out.println("mesin		=" +dhylla.getmesin() +"cc");
		System.out.println("kecepatan	=" +dhylla.getkecepatan() +"km");
		dhylla.maju();
		System.out.println(" ");	

	 mobil rahman = new mobil("HAMMER H3","T4VIR");

	 	System.out.println("Ini Mobil rahman");
		System.out.println("merk		=" +rahman.getmerk());
		System.out.println("platNomor	=" +rahman.getplatNomor());
		rahman.mundur();
		System.out.println(" ");


	mobil mirtha = new mobil("Lamborghini","N6969AC","Putih");

		System.out.println("Ini Mobil mirtha");
		System.out.println("merk		=" +mirtha.getmerk());
		System.out.println("platNomor 	=" +mirtha.getplatNomor());
		System.out.println("warna  		=" +mirtha.getwarna());
		mirtha.berhenti();
		System.out.println(" ");


	mobil anggita = new mobil("Carerra","N1234HF","Doreng",3900);

		System.out.println("Ini Mobil anggita");
		System.out.println("merk		=" +anggita.getmerk());
		System.out.println("platNomor 	=" +anggita.getplatNomor());
		System.out.println("warna  		=" +anggita.getwarna());
		System.out.println("mesin   	=" +anggita.getmesin() +"cc");
		anggita.belok();
		System.out.println(" ");

	mobil pamela = new mobil("Ford","T0111PEL","Merah Delima",1500,380);
		System.out.println("Ini Mobil pamela");
		System.out.println("merk		=" +pamela.getmerk());
		System.out.println("platNomor 	=" +pamela.getplatNomor());
		System.out.println("warna  		=" +pamela.getwarna());
		System.out.println("mesin   	=" +pamela.getmesin() +"cc");
		System.out.println("kecepatan	=" +pamela.getkecepatan() +"km"); 
		pamela.ngebut();
		System.out.println(" ");
	

	
}
}