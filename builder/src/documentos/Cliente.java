package documentos;

public class Cliente {

    // TIENE UN DIRECTOR
    Director director;


    // PARA DOCUMENTO HTML
    ConstructorDocumentoHTML constructor;

    // PARA DOCUMENTO JSON
    //ConstructorDocumentoJSON constructor;


    // LAS PARTES DEL DOCUMENTO
    String cabecera = "Cabecera del documento";
    String cuerpo = "Cuerpo del documento";
    String pie = "Pie del documento";

    public Cliente() {

    }

    public Documento construirDocumento() {

        // NUEVO CONSTRUCTOR
        constructor = new ConstructorDocumentoHTML();
        //constructor = new ConstructorDocumentoJSON();

        // NUEVO DIRECTOR CON EL CONSTRUCTOR ADECUADO
        director = new Director(constructor);

        // SE SOLICITA AL DIRECTOR LA CONSTRUCCION DEL DOCUMENTO
        director.construirDocumento(cabecera, cuerpo, pie);

        // SE RECOGE EL DOCUMENTO DEL CONSTRUCTOR
        return constructor.obtenerDocumento();
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        // SE CONSTRUYE EL OBJETO A TRAVÉS DEL MÉTODO CORRESPONDIENTE.
        System.out.println(cliente.construirDocumento());
    }
}
