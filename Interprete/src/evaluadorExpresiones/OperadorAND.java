package evaluadorExpresiones;

public class OperadorAND implements ExpresionAbstracta {

    ExpresionAbstracta terminal;

    public OperadorAND(ExpresionAbstracta terminal) {

        this.terminal = terminal;
    }

    @Override
    public String interpretar() {

        return terminal.interpretar();

    }
}
