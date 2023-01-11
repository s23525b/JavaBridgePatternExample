import java.util.ArrayList;

public class LiniaLotnicza {

    int cenaDodatkowegoBagazu;
    String email;
    String nazwa;
    ArrayList<Lot> listaLotow;

    public LiniaLotnicza(int cenaDodatkowegoBagazu, String email, String nazwa, ArrayList<Lot> listaLotow) {
        this.cenaDodatkowegoBagazu = cenaDodatkowegoBagazu;
        this.email = email;
        this.nazwa = nazwa;
        this.listaLotow = listaLotow;
    }

    public void dodajLot(Lot lot) {
        listaLotow.add(lot);
    }

    public void usunLot(Lot lot) {
        listaLotow.remove(lot);
    }

    @Override
    public String toString() {
        return "LiniaLotnicza { " +
                "nazwa = '" + nazwa + '\'' +
                ", cenaDodatkowegoBagazu = " + cenaDodatkowegoBagazu  + '\'' +
                ", email='" + email + '\'' +
                ", \nlistaLotow=" + listaLotow +
                " } ";
    }
}
