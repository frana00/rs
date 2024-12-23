package objeto_pila_lista;

public class Lista {

    public Lista() { System.out.println("Constructor de lista ");}

    public Object extractAt(int i)
    {
        System.out.println("Eliminación y retorno del elemento de la lista en la posición "+i);
        return null;
    }

    public Object showElementAt(int position)
    {
        System.out.println("Se muestra sin extraer el elemento en la posición "+position);
        return null;
    }

    public void insertFirst(Object elemento)
    {
        System.out.println("Se inserta un elemento al comienzo de la lista ");
    }


    public void insertLast(Object elemento)
    {
        System.out.println("Se inserta un elemento al final de la lista ");
    }


}
