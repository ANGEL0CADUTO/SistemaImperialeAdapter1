public class MassaImperiale implements SistemaImperialeInterface{

    //ATTRIBUTI
    private final double valoreImperiale;
    private final String unitaDiMisura;


    //COSTRUTTORE
    public MassaImperiale(double valoreImperiale){
        this.valoreImperiale = valoreImperiale;
        this.unitaDiMisura = "libbre";

    }


    //IMPLEMENTAZIONE INTERFACCIA
    @Override
    public double getValoreImperiale() {
        return valoreImperiale;
    }

    @Override
    public String getUnitaDiMisuraImperiale() {
        return unitaDiMisura;
    }
}
