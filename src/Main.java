public class Main {
    public static void main(String[] args) {

        // Creazione degli Adapter
        SistemaImperialeAdapter convertitoreMigliaToKilometri = new SistemaImperialeAdapter("miglia");
        SistemaImperialeAdapter convertitoreLibbreToChilogrammi = new SistemaImperialeAdapter("libbre");
        SistemaImperialeAdapter convertitoreFahrenheitToCelsius = new SistemaImperialeAdapter("fahrenheit");

        // Creazione istanze GrandezzeImperiali con i corrispettivi Adapter
        GrandezzaImperiale lunghezza = new GrandezzaImperiale(10.0, convertitoreMigliaToKilometri);
        GrandezzaImperiale massa = new GrandezzaImperiale(5.0, convertitoreLibbreToChilogrammi);
        GrandezzaImperiale temperatura = new GrandezzaImperiale(112.0,convertitoreFahrenheitToCelsius);


        // Stampa delle grandezze originali e di quelle convertite
        System.out.println("Lunghezza: " + lunghezza.getValore() + " " + lunghezza.getUnitaDiMisura());
        System.out.println("Lunghezza convertita: " + lunghezza.getValoreConvertito() );

        System.out.println("Massa: " + massa.getValore()+ " " + massa.getUnitaDiMisura());
        System.out.println("Massa convertita: " + massa.getValoreConvertito());

        System.out.println("Temperatura: " + temperatura.getValore() + " " + temperatura.getUnitaDiMisura());
        System.out.println("Temperatura convertita: " + temperatura.getValoreConvertito()  );

    }
}


