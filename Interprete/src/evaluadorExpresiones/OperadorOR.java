package evaluadorExpresiones;

public class OperadorOR implements ExpresionAbstracta {

    ExpresionAbstracta terminal;

    public OperadorOR(ExpresionAbstracta terminal) {

        this.terminal = terminal;
    }

    @Override
    public String interpretar() {

        return terminal.interpretar();

    }
}
