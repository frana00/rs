package clase_pila_lista;

public class Cliente {


    // EL CLIENTE SÓLO USA LA INTERFAZ OBJETIVO
    Pila pila;

    public Cliente()
    {
        // AUNQUE SABE QUE TIENE QUE USAR UN ADAPTADOR
        pila = new AdaptadorListaAPila();
    }
    public static void main (String [] args)
    {

        // PARA QUE EL CÓDIGO DEL CLIENTE SÓLO USE LOS MÉTODOS DE LA PILA

        Cliente usuario_pila = new Cliente();
        usuario_pila.pila.push(1);
        usuario_pila.pila.push(2);
        usuario_pila.pila.push(3);
        usuario_pila.pila.top();
        usuario_pila.pila.pop();


        Pila pila2 = new AdaptadorListaAPila();
        pila2.push(1);
        pila2.pop();
    }
}
