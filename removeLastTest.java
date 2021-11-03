package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;

public class removeLastTest {
    @Test
    public void testRemovelast() throws EmptyCollectionException {

        SingleLinkedListImpl<Integer> mylist = new SingleLinkedListImpl<Integer>(56,28,60,59,82);

        // lo que vamos a comproabr si el metodo removeLast elimina de verdad el ultimo  elemento en la lista pasado como parametro.
        // deleting last element by passing index
        int devuelve=mylist.removeLast(59);
        assertEquals(59,devuelve);
        System.out.println(mylist);
    }
    @Test
    public void testRemovelastEmpty() throws EmptyCollectionException {

        SingleLinkedListImpl<Integer> mylist = new SingleLinkedListImpl<Integer>();

        // Si es una lista vacia entonces salta la excepcion que esta vacio.

        int devuelve=mylist.removeLast(59);
        assertEquals(59,devuelve);
        System.out.println(mylist);
    }


}
