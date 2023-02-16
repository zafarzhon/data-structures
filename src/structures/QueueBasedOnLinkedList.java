package structures;

import java.util.Stack;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public final class QueueBasedOnLinkedList extends BasedOnLinkedListDataStorage {

    @Override
    public int get() {
        if (size > 0) {
            int res = first.value;
            if (first == last) {
                first = last = null;
            } else {
                Node temp = first;
                first = first.next;
                first.prev = null;
                temp.next = null;
            }
            size--;
            return res;
        } else
            throw new ArrayStoreException();
    }

}
