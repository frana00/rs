package evaluadorExpresiones;

public class BooleanoCero implements ExpresionAbstracta {

    ExpresionAbstracta terminal;

    public BooleanoCero(ExpresionAbstracta terminal) {

        this.terminal = terminal;
    }

    @Override
    public String interpretar() {

        return terminal.interpretar();

    }
}
