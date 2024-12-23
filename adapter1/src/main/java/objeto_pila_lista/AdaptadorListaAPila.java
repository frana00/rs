package objeto_pila_lista;

public class AdaptadorListaAPila   implements Pila{
    public Lista lista;

    public AdaptadorListaAPila()
    {
        lista = new Lista();
        System.out.println("Constructor del adaptador de lista a pila");
    }
    @Override
    public Object pop() {
        // TODO Auto-generated method stub
        return lista.extractAt(0);

    }
    @Override
    public Object top() {
        // TODO Auto-generated method stub
        return lista.showElementAt(0);

    }
    @Override
    public void push(Object elemento) {
        // TODO Auto-generated method stub
        lista.insertFirst(elemento);

    }



}
