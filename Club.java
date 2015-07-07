/**
 * Created by i on 7/7/2015.
 */
public class Club {
    private String namaClub;
    private Divisi divisi;
    private Liga liga;

    //constructor


    public Club(String namaClub, Divisi divisi, Liga liga) {
        this.namaClub = namaClub;
        this.divisi = divisi;
        this.liga = liga;
    }
    //set dan get


    public String getNamaClub() {
        return namaClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    //4
    public void getDivision (String club) {
        for (int j=0; j < liga.daftarDivisi.size(); j++){
            Divisi k = liga.daftarDivisi.get(j);
            for (int l=0; l < divisi.daftarClub.size(); l++){
                k.daftarClub.get(l);
                Club m = k.daftarClub.get(l);
                if (club==m.getNamaClub())
                {
                    System.out.println(k.getNamaDivisi());
                }
            }
        }
    }


    public void setDivisi(Divisi divisi) {
        this.divisi = divisi;
    }

    //5
    public void  getLiga(String club) {
        for (int b=0; b < liga.daftarDivisi.size(); b++){
            Divisi f = liga.daftarDivisi.get(b);
            for (int h=0; h < divisi.daftarClub.size(); h++){
                f.daftarClub.get(h);
                Club d = f.daftarClub.get(h);
                if (club == d.getNamaClub()){
                    System.out.println(liga.getNamaLiga());
                }

            }
        }


    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    //toString


    @Override
    public String toString() {
        return "Club{" +
                "namaClub='" + namaClub + '\'' +
                ", divisi=" + divisi +
                ", liga=" + liga +
                '}';
    }
}

