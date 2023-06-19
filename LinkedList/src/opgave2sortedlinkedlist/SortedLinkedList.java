package opgave2sortedlinkedlist;

public class SortedLinkedList {

    // TODO hvilke feltvariable skal klassen have
    private Node first;

    public SortedLinkedList() {
        first = null;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
     * naturlige ordning på elementerne
     */
    public void addElement(String e) {
        Node newNode = new Node();
        newNode.data = e;
        newNode.next = first;
        first = newNode;
    }

    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge
     */
    public void udskrivElements() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * Returnerer antallet af elementer i listen
     */
    public int countElements() {
        int count = 0;
        Node temp = first;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    /**
     * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis der blev fjernet fra listen ellers returneres false.
     */
    public boolean removeLast() {
        if (first == null) {
            // Listen er tom, der er intet at fjerne
            return false;
        } else if (first.next == null) {
            // Der er kun ét element i listen, fjern det
            first = null;
            return true;
        } else {
            // Find den anden sidste node i listen
            Node secondLast = first;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            // Fjern den sidste node fra listen
            secondLast.next = null;
            return true;
        }
    }

    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        if (first == null) {
            // Listen er tom, der er intet at fjerne
            return false;
        } else if (first.data.equals(e)) {
            // Fjern den første node, hvis den matcher det ønskede element
            first = first.next;
            return true;
        } else {
            // Find noden før den ønskede node, hvis den findes
            Node previousNode = first;
            while (previousNode.next != null && !previousNode.next.data.equals(e)) {
                previousNode = previousNode.next;
            }
            // Hvis noden ikke blev fundet, eller der er nået til slutningen af listen
            if (previousNode.next == null) {
                return false;
            }
            // Fjern den ønskede node ved at opdatere referencerne
            previousNode.next = previousNode.next.next;
            return true;
        }


    }


    // Privat indre klasse der modellerer en node i listen
    private class Node {
        public String data;
        public Node next;
    }
}
