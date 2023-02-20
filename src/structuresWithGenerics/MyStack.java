package structuresWithGenerics;

import java.util.Iterator;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public interface MyStack<E>{

    E pop();

    E peek();

    void push(E data);

    public Iterator<E> iterator();
}
