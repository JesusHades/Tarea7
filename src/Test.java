
public class Test {

    public static void main(String[] args) {

        ADTCola<Integer> cola = new ADTCola();

        cola.Vacia();
        System.out.println("\n");

        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        cola.enqueue(4);
        cola.enqueue(5);
        cola.enqueue(6);
        cola.transversal();


        System.out.println("\n");
        cola.dequeue();
        cola.dequeue();
        cola.transversal();


        System.out.println("\n");
        cola.enqueue(10);
        cola.transversal();

    }

}
