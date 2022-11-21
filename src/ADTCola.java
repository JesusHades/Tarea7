
public class ADTCola<T> {

    Nodo<T> primero;
    int tamanio = 0;

    public ADTCola() {

        primero = null;
        tamanio = 0;
    }

    public boolean Vacia() {
        if (tamanio == 0) {
            System.out.println("La cola esta vacia");
            return true;
        } else {
            return false;
        }
    }

    public int getTamaniuo() {
        return tamanio;
    }

    public void enqueue(T dato) {
        if (Vacia()) {
            Nodo<T> nuevo = new Nodo(dato, null);
            primero = nuevo;
        } else {
            Nodo<T> ultimo = primero;
            while (ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato, null);
            ultimo.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public void dequeue() {
        if (!Vacia()) {
            primero = primero.getSiguiente();
            tamanio--;
        } else {
            System.out.println("La cola esta vacia");
        }
    }

        public void transversal() {
        int cont = 0;
        Nodo aux = primero;
        while (cont < tamanio) {
            System.out.print(aux.getDato() + "-->");
            aux = aux.getSiguiente();
            cont++;
        }
    }
    
    
    
    
}
