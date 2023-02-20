package structuresWithGenerics;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public interface MyStack<E> {

    E pop();

    E peek();

    void push(E data);
}
