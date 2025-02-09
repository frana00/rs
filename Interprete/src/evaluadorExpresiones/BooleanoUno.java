package evaluadorExpresiones;

public class BooleanoUno implements ExpresionAbstracta {

    ExpresionAbstracta terminal;

    public BooleanoUno(ExpresionAbstracta terminal) {

        this.terminal = terminal;
    }

    @Override
    public String interpretar() {

        return terminal.interpretar();

    }
}
