package opgave3sortedlinkelistdouble;

public class SortedLinkedListDouble {

    private Node first;
    private Node last;
    private int size;

    public SortedLinkedListDouble() {
        first = new Node();
        last = new Node();
        first.next = last;
        last.prev = first;
        size = 0;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
     * naturlige ordning på elementerne
     */
    public void addElement(String e) {
        Node newNode = new Node();
        newNode.data = e;

        Node current = first.next;
        while (current != last && e.compareTo(current.data) > 0) {
            current = current.next;
        }

        Node previous = current.prev;
        previous.next = newNode;
        newNode.prev = previous;
        newNode.next = current;
        current.prev = newNode;

        size++;
    }

    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        Node current = first.next;
        while (current != last) {
            if (current.data.equals(e)) {
                Node previous = current.prev;
                Node next = current.next;
                previous.next = next;
                next.prev = previous;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge
     */
    public void udskrivElements() {
		Node temp = first;

		while (temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
    }

    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
     */
    public void udskrivBagfra() {

		Node temp = last;

		while (temp != first){
			System.out.println(temp.data);
			temp = last.prev;
		}
    }

    /**
     * Returnerer antallet af elementer i listen
     */
    public int countElements() {
		return size;
    }

    // Privat indre klasse der modellerer en node i en dobbeltkædet liste
    class Node {
        public String data;
        public Node next;
        public Node prev;
    }
}
