/**
 * @author KK
 * @version 1.0
 */

package com.kk.java;

public class Generics {

    public static void main(String[] args) {
        List<Integer> intList = new List<>(5);
        for (int i = 1; i <= 5; i++){
            intList.add(i);
            System.out.println(intList.get(i-1));
        }

        List<String> stringList = new List<>(5);
        for (int i = 1; i <= 5; i++){
            stringList.add("i"+i);
            System.out.println(stringList.get(i-1));
        }
    }
}

class List<T>{

    private int size;

    private T[] elements;

    public List(int capacity){
        elements = (T[]) new Object[capacity];
    }

    public void add(T item){
        if (elements.length == size){
            throw new RuntimeException("List if full");
        }
        elements[size] = item;
        size++;
    }

    public T get(int index){
        if (size == 0 || index > size){
            throw new RuntimeException("Invalid index provided");
        }
        return elements[index];
    }


}
