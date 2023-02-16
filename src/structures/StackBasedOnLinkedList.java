package structures;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public final class StackBasedOnLinkedList extends BasedOnLinkedListDataStorage {
    @Override
    public int get() {
        if (size > 0) {
            int res = last.value;
            if (first == last) {
                first = last = null;
            } else {
                Node temp = last;
                last = last.prev;
                last.next = null;
                temp.prev = null;
            }
            size--;
            return res;
        } else
            throw new ArrayStoreException();
    }


}
