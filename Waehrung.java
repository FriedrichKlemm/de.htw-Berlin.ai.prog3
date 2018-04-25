package bankprojekt;

public enum Waehrung {

    EUR(1), BGN(1.95583), KM(1.95583), LTL(3.4528);

    private Waehrung(double umrechnungskurs) {
        this.umrechnungskurs = umrechnungskurs;
    }

    private double umrechnungskurs;

    public double euroInWaehrungUmrechnen(double betrag) {
        return this.umrechnungskurs * betrag;
    }

    public double waehrungInEuroUmrechnen(double betrag) {
        return betrag / this.umrechnungskurs;
    }


}
