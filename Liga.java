import java.util.ArrayList;
/**
 * Created by i on 7/7/2015.
 */
public class Liga {
        private String namaLiga;
        ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

        //Constructor

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {
            return namaLiga;
        }

        public void setNamaLiga(String namaLiga) {
            this.namaLiga = namaLiga;
        }

        public ArrayList<Divisi> getDaftarDivisi() {
            return daftarDivisi;
        }

        public void setDaftarDivisi(Divisi divisi) {
            this.daftarDivisi.add(divisi);
        }

        public void getDaftarDivisi(String liga) {
            if (liga == getNamaLiga()) {
                for (int a = 0; a < daftarDivisi.size(); a++) {
                    System.out.println(daftarDivisi.get(a));
                }
            } else
                System.out.println("tidak ada Divisi");
        }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                ", daftarDivisi=" + daftarDivisi +
                '}';
    }
}

