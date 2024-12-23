package documentos;

public class Director {

    private ConstructorDocumento constructor;

    public Director(ConstructorDocumento constructor) {

        this.constructor = constructor;
    }

    public void construirDocumento(String cabecera, String cuerpo, String pie) {

        constructor.iniciarDocumento();
        constructor.construirCabecera(cabecera);
        constructor.construirCuerpo(cuerpo);
        constructor.construirPie(pie);
    }
}

