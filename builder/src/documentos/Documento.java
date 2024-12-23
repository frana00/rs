package documentos;

public class Documento {
    public Documento() {

    }

    // PARTES DEL DOCUMENTO SON LAS MISMAS PORQUE NO HAY HERENCIA PARA LOS SUBTIPOS, CADA DOCUMENTO CONCRETO ASIGNA UNA COSA DISTINTA CONCRETA A CADA PARTE
    private String cabecera;
    private String cuerpo;
    private String pie;


    // SETTERS DE LAS PARTES

    public void setCabecera(String cabecera) {

        this.cabecera = cabecera;

    }

    public void setCuerpo(String cuerpo) {

        this.cuerpo = cuerpo;

    }

    public void setPie(String pie) {

        this.pie = pie;

    }

    // MÉTODO PARA PODER IMPRIMIR EL DOCUMENTO DE MANERA POLIMORFICA

    public String toString() {

        // CLASE QUE PERMITE COMPONER AÑADIENDO SOBRE LA MARCHA STRINGS

        StringBuilder sb = new StringBuilder();

        sb.append(cabecera);
        sb.append("\n");
        sb.append(cuerpo);
        sb.append("\n");
        sb.append(pie);

        return sb.toString();

    }
}
