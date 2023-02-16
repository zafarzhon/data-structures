package structures;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public abstract class BasedOnLinkedListDataStorage implements DataStorage {
    protected StackBasedOnLinkedList.Node first;

    protected StackBasedOnLinkedList.Node last;
    protected int size;

    @Override
    public final void add(int value) {
        StackBasedOnLinkedList.Node node = new StackBasedOnLinkedList.Node(value);
        if (first == null) {
            first = node;
        } else if (first == last) {
            first.next = node;
            node.prev = first;
        } else {
            last.next = node;
            node.prev = last;
        }
        last = node;
        size++;
    }

    @Override
    public abstract int get();

    @Override
    public final int size() {
        return size;
    }

    protected final static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

    }
}
