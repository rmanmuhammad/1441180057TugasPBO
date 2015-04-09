class Laptop {
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public Laptop()
	{
		merk = "Toshiba";
		warna = "Hitam";
		wifi = "Terhubung";
		baterai= 100;
	}
	public Laptop(String merkInput, String warnaInput)
	{
		merk = merkInput;
		warna = warnaInput;
		
	}
	public Laptop(String merkInput, String warnaInput, String wifiInput)
	{
		merk = merkInput;
		warna = warnaInput;
		wifi = wifiInput;
	
		
	}
	public Laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		merk = merkInput;
		warna = warnaInput;
		wifi = wifiInput;
		baterai = bateraiInput;
	}
	public void menyala()
	{
		System.out.print("Welcome to Laptop");
	}
	public void mati()
	{
		System.out.print("Thankyou have a nice day");
	}
	public void indikatorBaterai()
	{
		System.out.print("Baterai Tinggal :" +baterai+ "%");
	}
	public void indikatorwifi()
	{
		System.out.print("Wifinya  :" +wifi);
	
	}

	//ini getter
	public String getMerk()
	{
		return merk;
	}
	public String getWarna()
	{
		return warna;
	}
	public String getWifi()
	{
		return wifi;
	}
	public int getBaterai()
	{
		return baterai;
	}
	
	//ini setter
	public String setMerk(String merk)
	{
		return this.merk = merk;
	}
	public String setWarna(String warna)
	{
		return this.warna = warna;
	}
	public String setWifi(String wifi)
	{
		return this.wifi = wifi;
	}
	public int setBaterai(int baterai)
	{
		return this.baterai = baterai;
	}
		

}