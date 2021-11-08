package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.*;
import org.junit.jupiter.api.Test;
import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.SingleLinkedListImpl;

import com.cajanegra.EmptyCollectionException;
import static org.junit.jupiter.api.Assertions.*;



public class removeLastTest{
    @Test

    public void testremovelast() throws EmptyCollectionException {

        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B","C","D");
        assertEquals("D",mylist.removeLast());


    }






    @Test
    public void testRemovelastinteger() throws EmptyCollectionException {

        SingleLinkedListImpl<Integer> mylist = new SingleLinkedListImpl<Integer>(56,28,60,59,82);

        // La lista deja añadir valores fuera de rango que es de A hasta Z, en este caso deja enteros
        //
        int devuelve=mylist.removeLast();
        assertEquals(82,devuelve);
        System.out.println(mylist);
    }

    // Si la lista esta vacia salta la excepcion de que la lista esta vacia.
    @Test
    public void testRemovelastEmpty() throws EmptyCollectionException {

        SingleLinkedListImpl<Integer> mylist = new SingleLinkedListImpl<Integer>();

        // Si es una lista vacia entonces salta la excepcion que esta vacio.

        int devuelve=mylist.removeLast();
        assertEquals("A",devuelve);
        System.out.println(mylist);
    }


}
