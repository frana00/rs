package evaluadorExpresiones;

public class Cliente {

    public static void main(String[] args) {

        // CONSTRUIR EL ÁRBOL DE ANÁLISIS SINTÁCTICO DE LA CADENA "0 OR 1"
        ExpresionAbstracta cero = new ExpresionTerminal("0");
        ExpresionAbstracta booleanoCero = new BooleanoCero(cero);
        ExpresionAbstracta or = new ExpresionTerminal("OR");
        ExpresionAbstracta operadorOR = new OperadorOR(or);
        ExpresionAbstracta uno = new ExpresionTerminal("1");
        ExpresionAbstracta booleanoUno = new BooleanoUno(uno);
        ExpresionAbstracta expresion1 = new Operacion(booleanoCero, operadorOR, booleanoUno);

        System.out.println(expresion1.interpretar());


        // CONSTRUIR EL ÁRBOL DE ANÁLISIS SINTÁCTICO DE LA CADENA "1 OR (0 AND 1)"
        ExpresionAbstracta expresion2 = new Operacion(new BooleanoUno(new ExpresionTerminal("1")),
                new OperadorOR(new ExpresionTerminal("OR")),
                new ExpresionEntreParentesis(new ExpresionTerminal("("),
                        new Operacion(new BooleanoCero(new ExpresionTerminal("0")),
                                new OperadorAND(new ExpresionTerminal("AND")),
                                new BooleanoUno(new ExpresionTerminal("1"))
                        ),
                        new ExpresionTerminal(")")
                )
        );

        System.out.println(expresion2.interpretar());
    }
}
