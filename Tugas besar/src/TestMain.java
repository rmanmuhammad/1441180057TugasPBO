/**
 * Created by User on 09/07/2015.
 */
public class TestMain {
    public static void main(String[] args) {
        Liga Spanyol = new Liga("Spanyol");
        Liga Italy   = new Liga("Italy");

        Divisi tingkat1 = new Divisi("BBVA Priemere");
        Divisi tingkat2 = new Divisi("Segunda Division");
        Divisi serieA   = new Divisi("Serie A");
        Divisi serieB   = new Divisi("Serie B");


        Klub satu1  = new Klub("Barcelona",tingkat1,Spanyol);
        Klub dua2   = new Klub("Real Madrid",tingkat1,Spanyol);
        Klub tiga3  = new Klub("Real Betis",tingkat2,Spanyol);
        Klub empat4 = new Klub("Girona",tingkat2,Spanyol);
        Klub lima5  = new Klub("Juventus",serieA,Italy);
        Klub enam6  = new Klub("AcMilan",serieA,Italy);
        Klub tujuh7 = new Klub("AcParma",serieB,Italy);
        Klub delapan8 = new Klub("Pescara",serieB,Italy);

        Spanyol.setDaftarDivisi(tingkat1);
        Spanyol.setDaftarDivisi(tingkat2);
        Spanyol.setDaftarKlub(satu1);
        Spanyol.setDaftarKlub(dua2);
        Spanyol.setDaftarKlub(tiga3);
        Spanyol.setDaftarKlub(empat4);

        Italy.setDaftarDivisi(serieA);
        Italy.setDaftarDivisi(serieB);
        Italy.setDaftarKlub(lima5);
        Italy.setDaftarKlub(enam6);
        Italy.setDaftarKlub(tujuh7);
        Italy.setDaftarKlub(delapan8);


        tingkat1.setDaftarKlub(satu1);
        tingkat1.setDaftarKlub(dua2);

        tingkat2.setDaftarKlub(tiga3);
        tingkat2.setDaftarKlub(empat4);

        serieA.setDaftarKlub(lima5);
        serieA.setDaftarKlub(enam6);

        serieB.setDaftarKlub(tujuh7);
        serieB.setDaftarKlub(delapan8);


        System.out.println("1. Get daftar divisi by namaLiga");
        System.out.println("Liga   = " +Spanyol.getNamaLiga());
        System.out.println("Divisi = " +Spanyol.getDaftarDivisi());
        System.out.println("Liga   = " +Italy.getNamaLiga());
        System.out.println("Divisi = " +Italy.getDaftarDivisi());


        System.out.println("\n");

        System.out.println("2. Get daftar klub by namaLiga");
        System.out.println("Liga   = " +Spanyol.getNamaLiga());
        System.out.println("Klub   = " +Spanyol.getDaftarKlub());
        System.out.println("Liga   = " +Italy.getNamaLiga());
        System.out.println("Klub   = " +Italy.getDaftarKlub());

        System.out.println("\n");

        System.out.println("3. Get daftar klub by namaDivisi");
        System.out.println("Liga   = " +Spanyol.getNamaLiga());
        System.out.println("Klub   = " +tingkat1.getDaftarKlub() + ", " +tingkat2.getDaftarKlub());
        System.out.println("Liga   = " +Italy.getNamaLiga());
        System.out.println("Klub   = " +serieA.getDaftarKlub() + ", " +serieB.getDaftarKlub());

        System.out.println("\n");

        System.out.println("4. Get klub ini berada di divisi mana by namaKlub");
        System.out.println("Liga   = " +Spanyol.getNamaLiga());
        System.out.println("Klub satu   = " +satu1.getNamaKlub() + " berasal dari " +satu1.getDivisi());
        System.out.println("Klub dua   = " +dua2.getNamaKlub() + " berasal dari " + dua2.getDivisi());
        System.out.println("Klub tiga   = " +tiga3.getNamaKlub() + " berasal dari " + tiga3.getDivisi());
        System.out.println("Klub empat   = " +empat4.getNamaKlub() + " berasal dari " + empat4.getDivisi());
        System.out.println("\n");
        System.out.println("Liga   = " +Italy.getNamaLiga());
        System.out.println("Klub lima   = " +lima5.getNamaKlub() + " berasal dari " + lima5.getDivisi());
        System.out.println("Klub enam   = " +enam6.getNamaKlub() + " berasal dari " + enam6.getDivisi());
        System.out.println("Klub lima   = " +tujuh7.getNamaKlub() + " berasal dari " + tujuh7.getDivisi());
        System.out.println("Klub enam   = " +delapan8.getNamaKlub() + " berasal dari " + delapan8.getDivisi());

        System.out.println("\n");

        System.out.println("5. Get klub ini berada di liga apa by namaKlub");
        System.out.println("Liga   = " + Spanyol.getNamaLiga());
        System.out.println("Klub satu  = " +satu1.getNamaKlub() + " berasal dari " +satu1.getLiga());
        System.out.println("Klub dua   = " + dua2.getNamaKlub() + " berasal dari " + dua2.getLiga());
        System.out.println("Klub tiga  = " + tiga3.getNamaKlub() + " berasal dari " + tiga3.getLiga());
        System.out.println("Klub empat = " + empat4.getNamaKlub() + " berasal dari " + empat4.getLiga());
        System.out.println("\n");
        System.out.println("Liga   = " +Italy.getNamaLiga());
        System.out.println("Klub lima = " + lima5.getNamaKlub() + " berasal dari " + lima5.getLiga());
        System.out.println("Klub enam = " + enam6.getNamaKlub() + " berasal dari " + enam6.getLiga());
        System.out.println("Klub lima = " + tujuh7.getNamaKlub() + " berasal dari " + tujuh7.getLiga());
        System.out.println("Klub enam = " + delapan8.getNamaKlub() + " berasal dari " + delapan8.getLiga());
    }
}
