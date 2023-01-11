public class Miedzynarodowy implements Lot {
    int czasTrwania;
    String data;
    String lotniskoOdlotu;
    String lotniskoPrzylotu;
    String modelSamolotu;
    int numerLotu;
    int iloscMinietychKrajow;

    public Miedzynarodowy(int czasTrwania, String data, String lotniskoOdlotu, String lotniskoPrzylotu, String modelSamolotu, int numerLotu, int iloscMinietychKrajow) {
        this.czasTrwania = czasTrwania;
        this.data = data;
        this.lotniskoOdlotu = lotniskoOdlotu;
        this.lotniskoPrzylotu = lotniskoPrzylotu;
        this.modelSamolotu = modelSamolotu;
        this.numerLotu = numerLotu;
        this.iloscMinietychKrajow = iloscMinietychKrajow;
    }

    @Override
    public void wyszukajPolaczeniePrzesiadkowe() {
        System.out.println("Jest 5 dostępnych polączeń przesiadkowych");
    }

    @Override
    public String toString() {
        return "\nMiedzynarodowy{" +
                "czasTrwania=" + czasTrwania +
                ", data='" + data + '\'' +
                ", lotniskoOdlotu='" + lotniskoOdlotu + '\'' +
                ", lotniskoPrzylotu='" + lotniskoPrzylotu + '\'' +
                ", modelSamolotu='" + modelSamolotu + '\'' +
                ", numerLotu=" + numerLotu +
                ", iloscMinietychKrajow=" + iloscMinietychKrajow +
                '}';
    }
}
