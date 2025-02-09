package evaluadorExpresiones;

public class ParentesisIzq implements ExpresionAbstracta {

    ExpresionAbstracta terminal;

    public ParentesisIzq(ExpresionAbstracta terminal) {

        this.terminal = terminal;
    }

    @Override
    public String interpretar() {

        return terminal.interpretar();

    }
}
