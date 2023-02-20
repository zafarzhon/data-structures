package structuresWithGenerics.impl;

import structuresWithGenerics.MyStack;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public class MyStackImpl<E> implements MyStack<E>{

    private Object[] elementData;
    private int size;

    public MyStackImpl(int size){
        if(size>0){
            elementData = new Object[size];
        }else
            elementData = new Object[5];
    }

    public MyStackImpl(){
        elementData = new Object[5];
    }

    public void grow(int newSize){
        Object[] newElementData = new Object[newSize];
        System.arraycopy(elementData,0,newElementData,0,getSize());
        elementData = newElementData;
    }

    public int getSize(){return size;}

    private void setSize(int size){
        this.size = size;
    }

    @Override
    public E pop() {
        if(size == 0) return null;
        Object element = elementData[getSize()-1];
        setSize(getSize()-1);
        elementData[getSize()] = null;
        return (E)element;
    }

    @Override
    public E peek() {
        return (E)elementData[0];
    }

    @Override
    public void push(E data) {
        if(elementData.length==getSize()) grow(elementData.length*2);
        elementData[getSize()] = data;
        setSize(getSize()+1);
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E>{

        int cursor;
        @Override
        public boolean hasNext() {
            return cursor<getSize();
        }

        @Override
        public E next() {
            if(cursor==getSize()) throw new NoSuchElementException();
            return (E)elementData[cursor++];
        }

        @Override
        public void remove() {
            if(cursor == 0) throw new NoSuchElementException();
            for(int i = cursor-1;i<getSize()-1;i++){
                elementData[i] = elementData[i+1];
            }
            elementData[getSize()-1] = null;
            setSize(getSize()-1);
            cursor--;
        }
    }
}
