public class GrandezzaInternazionale implements SistemaInternazionaleInterface {


    public double valoreInternazionale;
    public String unitaDiMisuraInternazionale;

    public GrandezzaInternazionale(double valoreInternazionale, String unitaDiMisuraInternazionale) {
        this.valoreInternazionale = valoreInternazionale;
        this.unitaDiMisuraInternazionale = unitaDiMisuraInternazionale;
    }

    public double getValoreInternazionale() {
        return valoreInternazionale;
    }

    public String getUnitaDiMisuraInternazionale() {
        return unitaDiMisuraInternazionale;
    }

}
