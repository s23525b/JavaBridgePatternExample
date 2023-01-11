
public class Krajowy implements Lot {
    int czasTrwania;
    String data;
    String lotniskoOdlotu;
    String lotniskoPrzylotu;
    String modelSamolotu;
    int numerLotu;
    int maxWysokoscPrzelotowa;

    public Krajowy(int czasTrwania, String data, String lotniskoOdlotu, String lotniskoPrzylotu, String modelSamolotu, int numerLotu, int maxWysokoscPrzelotowa) {
        this.czasTrwania = czasTrwania;
        this.data = data;
        this.lotniskoOdlotu = lotniskoOdlotu;
        this.lotniskoPrzylotu = lotniskoPrzylotu;
        this.modelSamolotu = modelSamolotu;
        this.numerLotu = numerLotu;
        this.maxWysokoscPrzelotowa = maxWysokoscPrzelotowa;
    }

    @Override
    public void wyszukajPolaczeniePrzesiadkowe() {
        System.out.println("Brak połączeń przesiadkowych w lotach krajowych");
    }

    @Override
    public String toString() {
        return "\nKrajowy{" +
                "czasTrwania=" + czasTrwania +
                ", data='" + data + '\'' +
                ", lotniskoOdlotu='" + lotniskoOdlotu + '\'' +
                ", lotniskoPrzylotu='" + lotniskoPrzylotu + '\'' +
                ", modelSamolotu='" + modelSamolotu + '\'' +
                ", numerLotu=" + numerLotu +
                ", maxWysokoscPrzelotowa=" + maxWysokoscPrzelotowa +
                '}';
    }
}
