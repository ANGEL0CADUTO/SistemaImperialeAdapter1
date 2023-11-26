
public class GrandezzaImperiale {
    private double valore;
    private ConvertitoreGenericoInterface convertitore;

    public GrandezzaImperiale(double valore, ConvertitoreGenericoInterface convertitore) {
        this.valore = valore;
        this.convertitore = convertitore;
    }

    public double getValore() {
        return valore;
    }

    public String getUnitaDiMisura() {

        String unitaImperiale = ((SistemaImperialeAdapter) convertitore).getUnitaImperiale();

        return unitaImperiale;
        }

        public double getValoreConvertito() {
            return convertitore.converti(valore);
        }


    }

