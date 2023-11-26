
public class GrandezzaImperiale {

    //Attributi
    private double valore;
    private ConvertitoreGenericoInterface convertitore;

    //Costruttore
    public GrandezzaImperiale(double valore, ConvertitoreGenericoInterface convertitore) {
        this.valore = valore;
        this.convertitore = convertitore;
    }


    // Metodo per ricavarsi valore della grandezza
    public double getValore() {
        return valore;
    }



    // Metodo per ottenere l'unità di misura
    public String getUnitaDiMisura() {
        return ((SistemaImperialeAdapter) convertitore).getUnitaImperiale();
    }


    // Metodo per ricavare corrispettivo valore nel sistema internazionale
    public double getValoreConvertito() {
        return convertitore.converti(valore);
    }


    }

