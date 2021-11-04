package com.practica.cajanegra;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.SingleLinkedListImpl;

import com.cajanegra.EmptyCollectionException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class removeLastElementTest {
    private AbstractSingleLinkedListImpl<String> lista;

    @Test
    public void testRemoveLast () throws EmptyCollectionException {
        lista = new SingleLinkedListImpl<>("A", "B", "C");
        assertEquals("C", lista.removeLast("C"));
    }

    @Test
    public void testRemoveLastIn1(){
        lista = new SingleLinkedListImpl<>();
        Exception exception = assertThrows(com.cajanegra.EmptyCollectionException.class, () -> lista.removeLast("A"));
        assertEquals("La colecci\u00f3n La lista est\u00e1 vac\u00eda est\u00e1 vac\u00eda.", exception.getMessage());
    }

    @Test
    public void testRemoveLastIn2() throws  java.util.NoSuchElementException{
        lista = new SingleLinkedListImpl<>("A", "B", "C");
        Exception exception = assertThrows(java.util.NoSuchElementException.class, () -> lista.removeLast("D"));
        assertEquals("El elemento no esta en la lista", exception.getMessage());
    }
}
