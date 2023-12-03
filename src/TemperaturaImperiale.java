public class TemperaturaImperiale implements SistemaImperialeInterface{

    //ATTRIBUTI
    private double valoreImperiale;
    private String unitaDiMisuraImperiale;

    //COSTRUTTORE
    public TemperaturaImperiale(double valoreImperiale){
        this.valoreImperiale = valoreImperiale;
        this.unitaDiMisuraImperiale = "fahreneit";
    }


    //IMPLEMENTAZIONE INTERFACCIA
    @Override
    public double getValoreImperiale() {
        return valoreImperiale;
    }

    @Override
    public String getUnitaDiMisuraImperiale() {
        return unitaDiMisuraImperiale;
    }
}
