package structuresWithGenerics.impl;

import structuresWithGenerics.MyStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public class MyStackImpl<E> implements MyStack<E>{


    private Object[] elementData;
    private int size;
    //ArrayList

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
}
