import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Lot lot1 = new Miedzynarodowy(342, "2023-02-14", "WAW", "CLE",
                "Boeing 737", 214, 9);
        Lot lot2 = new Krajowy(90, "2023-01-23", "WAW", "GDA",
                "Boeing 717", 234, 9000);

        ArrayList<Lot> listaLotow1 = new ArrayList<Lot>();

        LiniaLotnicza LOT = new LiniaLotnicza(240, "info@lot.pl", "LOT", listaLotow1);
        LOT.listaLotow.add(lot1);
        LOT.listaLotow.add(lot2);

        System.out.println(LOT.toString());
    }
}
