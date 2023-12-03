public class LunghezzaImperiale implements SistemaImperialeInterface {

    //ATTRIBUTI
    private double misuraImperiale;
    private String unitaDiMisuraImperiale;


    //COSTRUTTORE
    public LunghezzaImperiale(double misuraImperiale){
        this.misuraImperiale = misuraImperiale;
        this.unitaDiMisuraImperiale = "Miglia";
    }


    //IMPLEMENTAZIONE INTERFACCIA
    @Override
    public double getValoreImperiale() {
        return misuraImperiale ;
    }

    public String getUnitaDiMisuraImperiale() {
        return unitaDiMisuraImperiale;
    }

}
