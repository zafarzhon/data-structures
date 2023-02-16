package structures;

import java.util.Stack;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public final class QueueBasedOnLinkedList extends BasedOnLinkedListDataStorage {
    private Node last;

    @Override
    public void add(int value) {
        Node node = new Node(value);
        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    @Override
    public int get() {
        if (size > 0) {
            int res = first.value;
            first = first.next;
            if (first == null) {
                last = null;
            }
            size--;
            return res;
        } else
            throw new ArrayStoreException();
    }

}
