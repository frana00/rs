package evaluadorExpresiones;

public class ExpresionTerminal implements ExpresionAbstracta {

    String terminal;

    public ExpresionTerminal(String terminal) {

        this.terminal = terminal;

    }

    @Override
    public String interpretar() {

        return terminal;
    }
}
