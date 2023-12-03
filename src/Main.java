public class Main {
    public static void main(String[] args) {

        // Creazione istanze di grandezze imperiali
        LunghezzaImperiale lunghezza = new LunghezzaImperiale(10);
        MassaImperiale massa = new MassaImperiale(85);
        TemperaturaImperiale temperatura = new TemperaturaImperiale(46);

        // Creazione istanze Adapter
        SistemaImperialeAdapter s1 = new SistemaImperialeAdapter(lunghezza);
        SistemaImperialeAdapter s2 = new SistemaImperialeAdapter(massa);
        SistemaImperialeAdapter s3 = new SistemaImperialeAdapter(temperatura);


        // Stampa delle grandezze originali e di quelle convertite
        System.out.println("Lunghezza iniziale: " + lunghezza.getValoreImperiale() + " " + lunghezza.getUnitaDiMisuraImperiale());
        System.out.println("Lunghezza convertita: " + s1.getValoreInternazionale() + " " + s1.getUnitaDiMisuraInternazionale() );

        System.out.println("Massa iniziale: " + massa.getValoreImperiale()+ " " + massa.getUnitaDiMisuraImperiale());
        System.out.println("Massa convertita: " + s2.getValoreInternazionale() + " " + s2.getUnitaDiMisuraInternazionale());

        System.out.println("Temperatura iniziale: " + temperatura.getValoreImperiale() + " " + temperatura.getUnitaDiMisuraImperiale());
        System.out.println("Temperatura convertita: " + s3.getValoreInternazionale() + " " + s3.getUnitaDiMisuraInternazionale());






    }
}


