package evaluadorExpresiones;

public class Operacion implements ExpresionAbstracta {

    ExpresionAbstracta expI;
    ExpresionAbstracta op;
    ExpresionAbstracta expD;

    public Operacion(ExpresionAbstracta expI, ExpresionAbstracta op, ExpresionAbstracta expD) {
        this.expI = expI;
        this.op = op;
        this.expD = expD;
    }

    @Override
    public String interpretar() {

        boolean booleanI = expI.interpretar().equals("1") ? true : false;
        boolean booleanD = expD.interpretar().equals("1") ? true : false;
        boolean resultado;
        String operador = op.interpretar();

        if (operador.equals("AND"))
            resultado = booleanI && booleanD;
        else
            resultado = booleanI || booleanD;

        if (resultado)
            return "1";
        else
            return "0";

    }
}
