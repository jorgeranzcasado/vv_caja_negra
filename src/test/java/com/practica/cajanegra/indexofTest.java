package com.practica.cajanegra;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class indexofTest {
    private AbstractSingleLinkedListImpl<String> mylist;
    @BeforeEach
    public void setUp() {
        this.mylist= new SingleLinkedListImpl<>("A","B","C","D");
    }
    @Test
    // Lista con varios elementos y vamos a comprobar si devuelve bien el indice.
    public void indexofVariosElementos() {
        assertEquals(1,mylist.indexOf("A"));

    }

    //Probamos con otro elemento y esta vez para comprobar si el indice que devuelve lo devuelve,
    // bien o no, en este caso es A con indice 1 y vamos a comparar si realmente devuelve 2 o 1.

    @Test
    public void indexofVariosElementos2() {
    // Vamos a comrobar si devuelve indice de elemtnos de la lista que no sean los primeros
        assertEquals(2,mylist.indexOf("B"));

    }

    @Test
    public void indexofVariosElementos3() {
    // Vamos a comrobar si devuelve indice de elementos que estan en el medio
        assertEquals(3,mylist.indexOf("C"));

    }

    @Test
    public void indexofVariosElementos4() {
    // Vamos a comrobar si devuelve indice del ultimo elemento de la lista
        assertEquals(4,mylist.indexOf("D"));

    }

    //Clase invalida:   elemento fuera de rango
    @Test
    public void indexofInvalido2() {
        assertThrows (NoSuchElementException.class, () -> mylist.indexOf("E"));
    }
}
