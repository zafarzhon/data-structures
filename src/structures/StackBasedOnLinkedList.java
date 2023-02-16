package structures;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public final class StackBasedOnLinkedList extends BasedOnLinkedListDataStorage {
    @Override
    public void add(int value) {
        Node node = new Node(value);
        if (first == null) {
        } else {
            node.next = first;
        }
        first = node;
        size++;
    }

    @Override
    public int get() {
        if (size > 0) {
            int res = first.value;
            first = first.next;
            size--;
            return res;
        } else
            throw new ArrayStoreException();
    }


}
