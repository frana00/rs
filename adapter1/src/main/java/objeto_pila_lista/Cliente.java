package objeto_pila_lista;

public class Cliente {


    public Cliente()
    {

    }
    public static void main (String [] args)
    {


        Pila pila2 = new AdaptadorListaAPila();
        pila2.push(1);
        pila2.pop();
    }
}
