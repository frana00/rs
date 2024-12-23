package clase_pila_lista;

public class AdaptadorListaAPila  extends Lista implements Pila{

    public AdaptadorListaAPila() {System.out.println("Constructor del adaptador de lista a pila");}
    @Override
    public Object pop() {
        // TODO Auto-generated method stub
        return extractAt(0);

    }
    @Override
    public Object top() {
        // TODO Auto-generated method stub
        return showElementAt(0);

    }
    @Override
    public void push(Object elemento) {
        // TODO Auto-generated method stub
        insertFirst(elemento);

    }



}
