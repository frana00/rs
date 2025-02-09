package evaluadorExpresiones;

public class ParentesisDch implements ExpresionAbstracta {

    ExpresionAbstracta terminal;

    public ParentesisDch(ExpresionAbstracta terminal) {

        this.terminal = terminal;
    }

    @Override
    public String interpretar() {

        return terminal.interpretar();

    }
}
