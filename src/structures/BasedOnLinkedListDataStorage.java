package structures;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public abstract class BasedOnLinkedListDataStorage implements DataStorage {
    protected Node first;

    protected int size;

    @Override
    public final int size() {
        return size;
    }

    protected final static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }
}
