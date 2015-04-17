class testTabungan {
	public static void main(String[] args) {
		tabungan arif = new tabungan();
		System.out.println("Ini Tabungan DhyllaRahman");
		System.out.println("simpanan 	=" +arif.setsimpanan());
		System.out.println("pemilikRek 	=" +arif.setpemilikRek());
		System.out.println("noRek 		=" +arif.getnoRekening());
		System.out.println("bunga 		=" +arif.getbunga());
		arif.menabung();
		System.out.println(" ");




tabungan rahman = new tabungan("RahmanMuhammad","BANK KALBAR");
		System.out.println("Ini Tabungan RahmanMuhammad");
		System.out.println("simpanan 	=" +rahman.setsimpanan());
		System.out.println("pemilikRek 	=" +rahman.setpemilikRek());
		rahman.mengambil();
		System.out.println(" ");



tabungan dhylla = new tabungan("DhyllaRamadhini","BANK KURT",1441189999);
		System.out.println("Ini Tabungan DhyllaRamadhini");
		System.out.println("simpanan 	=" +dhylla.setsimpanan());
		System.out.println("pemilikRek 	=" +dhylla.setpemilikRek());
		System.out.println("noRek 		=" +dhylla.getnoRekening());
		dhylla.transfer();
		System.out.println("");



tabungan mirtha = new tabungan("MirthaRahman","BANK THOYIB",1441188878,70);

		System.out.println("Ini Tabungan MirthaRahman");
		System.out.println("simpanan 	=" +mirtha.setsimpanan());
		System.out.println("pemilikRek 	=" +mirtha.setpemilikRek());
		System.out.println("noRek 		=" +mirtha.getnoRekening());
		System.out.println("bunga 		=" +mirtha.getbunga());
		mirtha.menerimaTransfer();
		System.out.println(" ");
	





	}

}