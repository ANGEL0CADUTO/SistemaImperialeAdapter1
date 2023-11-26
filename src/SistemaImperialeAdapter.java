public class SistemaImperialeAdapter implements ConvertitoreGenericoInterface {
    private final String unitaImperiale;

    public SistemaImperialeAdapter(String unitaImperiale) {
        this.unitaImperiale = unitaImperiale;
    }
    public String getUnitaImperiale() {
        return unitaImperiale;
    }


    public double converti(double valore) {
        switch (unitaImperiale.toLowerCase()) {
            case "miglia":
                return valore * 1.609;
            case "libbre":
                return valore * 0.453;
            case "fahrenheit":
                return ((valore - 32) * 0.555);
            // Da aggiungere tutti gli altri casi
            default:
                System.out.println("Conversione non supportata per l'unità imperiale: " + unitaImperiale);
                return valore;
        }
    }
}
