package evaluadorExpresiones;

public class ExpresionBooleano implements ExpresionAbstracta {

    ExpresionAbstracta booleano;

    public ExpresionBooleano(ExpresionAbstracta booleano) {

        this.booleano = booleano;
    }

    @Override
    public String interpretar() {

        return booleano.interpretar();

    }
}
