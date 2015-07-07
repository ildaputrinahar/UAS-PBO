/**
 * Created by i on 7/7/2015.
 */
public class Main {
    public static void main(String[] args) {


        //construct Liga
        Liga inggris = new Liga("inggris");
        Liga Indonesia = new Liga("Indonesia");


        //construct division
        Divisi EPL = new Divisi("English Premiere League",inggris);
        Divisi CD = new Divisi("Championship Division",inggris);
        Divisi LSI = new Divisi("Liga Super Indonesia",Indonesia);
        Divisi LPI= new Divisi("Liga Primer Indonesia",Indonesia);


        //construct club
        Club arsenal = new Club("Arsenal",EPL,inggris);
        Club Liverpool = new Club("Liverpool",EPL,inggris);
        Club fulham = new Club("Fulham",CD,inggris);
        Club wigan = new Club("Wigan",CD,inggris);
        Club arema = new Club("arema",LSI,Indonesia);
        Club PersibBandung = new Club("Persib Bandung",LSI,Indonesia);
        Club BogorRaya = new Club("Bogor Raya",LPI,Indonesia);
        Club BandungFC =new Club("Bandung FC", LPI,Indonesia);

        inggris.setDaftarDivisi(EPL);
        inggris.setDaftarDivisi(CD);
        Indonesia.setDaftarDivisi(LSI);
        Indonesia.setDaftarDivisi(LPI);

        EPL.setDaftarClub(arsenal);
        EPL.setDaftarClub(Liverpool);
        CD.setDaftarClub(fulham);
        CD.setDaftarClub(wigan);
        LSI.setDaftarClub(arema);
        LSI.setDaftarClub(PersibBandung);
        LPI.setDaftarClub(BogorRaya);
        LPI.setDaftarClub(BandungFC);

        //1 Get daftar divisi by nama liga
        System.out.println("1. Daftar nama divisi dengan nama Liga");
        System.out.println("Daftar divisi Liga Inggris");
        inggris.getDaftarDivisi("Inggris");
        System.out.println();

        //2 Get Daftar Klub by nama liga
        System.out.println("2. Daftar Klub dengan nama Liga" );
        System.out.println("***Daftar nama Klub Liga Inggris***");
        EPL.getDaftarClubLiga("Inggris");

        System.out.println("***Daftar nama Klub Liga Indonesia***");
        LSI.getDaftarClubLiga("Indonesia");
        System.out.println();


        //3 Get Daftar Klub by nama Divisi
        System.out.println("3. Daftar Klub dengan nama Divisi");
        System.out.println("Daftar nama Klub Divisi Championship Division");
        CD.getDaftarClubDivisi("Championship Division");
        System.out.println("Daftar nama Klub Divisi LPI");
        LPI.getDaftarClubDivisi("LPI");
        System.out.println();

        //4  Get Klub ini berada di divisi mana by nama Klub
        System.out.println("4. Nama Divisi berdasarkan nama Klub");
        System.out.print("Klub Liverpool berada di divisi :");
        Liverpool.getDivision("Liverpool");
        System.out.print("Klub BogorRaya berada di divisi :");
        BogorRaya.getDivision("BogorRaya");
        System.out.println();

        //5 Get Klub ini berada di liga apa by nama Klub
        System.out.println("5. Nama Liga berdasarkan nama Klub");
        System.out.print("Klub Wigan berada di Liga ");
        wigan.getLiga("Wigan");
        System.out.print("Klub Bandung berada di Liga ");
        BandungFC.getLiga("Bandung FC");




    }

}

