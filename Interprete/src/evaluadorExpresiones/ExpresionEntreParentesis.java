package evaluadorExpresiones;

public class ExpresionEntreParentesis implements ExpresionAbstracta {

    ExpresionAbstracta parI;
    ExpresionAbstracta exp;
    ExpresionAbstracta parD;

    public ExpresionEntreParentesis(ExpresionAbstracta parI, ExpresionAbstracta exp, ExpresionAbstracta parD) {

        this.parI = parI;
        this.exp = exp;
        this.parD = parD;
    }

    @Override
    public String interpretar() {

        return exp.interpretar();

    }
}
