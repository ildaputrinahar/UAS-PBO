import java.util.ArrayList;
/**
 * Created by i on 7/7/2015.
 */
public class Divisi {

        private String namaDivisi;
        private Liga liga;
        ArrayList<Club> daftarClub = new ArrayList<Club>();

        //Constructor


        public Divisi(String namaDivisi, Liga liga) {
            this.namaDivisi = namaDivisi;
            this.liga = liga;
        }

        //Setter Getter

        public String getNamaDivisi() {
            return namaDivisi;
        }

        public void setNamaDivisi(String namaDivisi) {
            this.namaDivisi = namaDivisi;
        }

        public Liga getLiga() {
            return liga;
        }

        public void setLiga(Liga liga) {
            this.liga = liga;
        }

        public void setDaftarClub(Club club) {
            this.daftarClub.add(club);
        }

        public ArrayList<Club> getDaftarClub() {
            return daftarClub;
        }
        //2
        public void getDaftarClubLiga (String findLiga){
            if (findLiga==liga.getNamaLiga()) {
                for (int b=0; b < liga.daftarDivisi.size(); b++){
                    Divisi d = liga.daftarDivisi.get(b);
                    System.out.println(d.getNamaDivisi());
                    for (int c=0; c < daftarClub.size(); c++){
                        System.out.println(d.daftarClub.get(c));
                    }
                }

            }
            else
                System.out.println("tidak ada club di liga ini");

        }
        //3
        public void getDaftarClubDivisi(String findDivisi)
        {
            for (int a=0; a < liga.daftarDivisi.size(); a++){
                Divisi b =liga.daftarDivisi.get(a);
                if(findDivisi == b.getNamaDivisi()){
                    for (int c=0; c < daftarClub.size(); c++ ) {
                        System.out.println(b.daftarClub.get(c));
                    }
                }
            }


            for (int z=0; z < liga.daftarDivisi.size(); z++){
                Divisi x = liga.daftarDivisi.get(0);
                Divisi y = liga.daftarDivisi.get(1);
                if (findDivisi != x.getNamaDivisi()){
                    if (findDivisi != y.getNamaDivisi()) {
                        System.out.println("tidak ada Club");
                        break;
                    }
                }
            }
        }
        //toString

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDivisi + '\'' +
                ", liga=" + liga +
                ", daftarClub=" + daftarClub +
                '}';
    }
}

