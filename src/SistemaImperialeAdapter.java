public class SistemaImperialeAdapter implements SistemaInternazionaleInterface {

    //ATTRIBUTI
    private SistemaInternazionaleInterface grandezzaInternazionale;

    //COSTRUTTORE
    public SistemaImperialeAdapter(SistemaImperialeInterface grandezzaImperiale) {
        this.grandezzaInternazionale= converti(grandezzaImperiale);
    }


    private GrandezzaInternazionale converti(SistemaImperialeInterface imperialUnit) {

        // CONVERSIONE da imperiale a internazionale nei vari casi:

        //LUNGHEZZA
        if (imperialUnit instanceof LunghezzaImperiale) {
            LunghezzaImperiale lunghezza = (LunghezzaImperiale) imperialUnit;
            double valoreInternazionale = 1.609 * lunghezza.getValoreImperiale();
            return new GrandezzaInternazionale(valoreInternazionale, "Km");
        }

        //MASSA
        if(imperialUnit instanceof MassaImperiale){
            MassaImperiale massa = (MassaImperiale) imperialUnit;
            double valoreInternazionale = 0.453 * massa.getValoreImperiale();
            return new GrandezzaInternazionale(valoreInternazionale, "Kg");
        }

        //TEMPERATURA
        if(imperialUnit instanceof TemperaturaImperiale){
            TemperaturaImperiale temp = (TemperaturaImperiale) imperialUnit;
            double valoreInternazionale  = ((temp.getValoreImperiale() - 32) * 0.555);

            return new GrandezzaInternazionale(valoreInternazionale,"Celsius");

        }
        //caso di ERRORE
        else{
            System.out.println("Conversione non supportata per l'unità imperiale: " + imperialUnit.getUnitaDiMisuraImperiale());
            return null;
        }
    }


    //Implementazione Interfaccia:

    @Override
    public double getValoreInternazionale() {
        return grandezzaInternazionale.getValoreInternazionale();
    }

    @Override
    public String getUnitaDiMisuraInternazionale() {
        return grandezzaInternazionale.getUnitaDiMisuraInternazionale();
    }
}




