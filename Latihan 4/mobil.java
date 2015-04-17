class mobil {

	String merk;
	String platNomor;
	String warna;
	int mesin;
	int kecepatan;
	

	public mobil(){

		merk		="VW Combi";
		platNomor	="KB1996DE";
		warna		="Gold";
		mesin		=2000;
		kecepatan	=290;

	}
	public mobil(String merkinput, String platNomorinput){

		merk		=merkinput;
		platNomor	=platNomorinput;

	}
	public mobil(String merkinput, String platNomorinput, String warnainput){

		merk 		=merkinput;
		platNomor	=platNomorinput;
		warna 		=warnainput;

	}
	public mobil(String merkinput, String platNomorinput, String warnainput, int mesininput){

		merk 		=merkinput;
		platNomor	=platNomorinput;
		warna 		=warnainput;
		mesin 		=mesininput;
		

	}
	public mobil(String merkinput, String platNomorinput, String warnainput, int mesininput, int kecepataninput){

		merk 		=merkinput;
		platNomor	=platNomorinput;
		warna 		=warnainput;
		mesin 		=mesininput;
		kecepatan	=kecepataninput;
	}

	public void maju(){

		System.out.println("mobil ini maju");
	}
	public void mundur(){

		System.out.println("mobil ini mundur");
	}
	public void berhenti(){

		System.out.println("mobil ini berhenti");
	}
	public void belok(){

		System.out.println("mobil ini berbelok");
	}
	public void ngebut(){

		System.out.println("mobil ini ngebut");
	}
	public void ngerem(){

		System.out.println("mobil ini mengerem");	
	}

	public String getmerk(){

		return merk;
	}
	public String getplatNomor(){

		return platNomor;
	}
	public String getwarna(){

		return warna;
	}
	public int getmesin(){

		return mesin;
	}
	public int getkecepatan(){

		return kecepatan;
	}
	
}