public class SistemaImperialeAdapter implements ConvertitoreGenericoInterface {

    //Attributi
    private final String unitaImperiale;

    //Costruttore
    public SistemaImperialeAdapter(String unitaImperiale) {
        this.unitaImperiale = unitaImperiale;
    }

    // Metodo per ricavarsi unità di misura imperiale
    public String getUnitaImperiale() {
        return unitaImperiale;
    }


    //Metodo per convertire le grandezze
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
