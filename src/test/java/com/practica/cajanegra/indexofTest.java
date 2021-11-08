package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.*;
import com.cajanegra.SingleLinkedListImpl;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class indexofTest {



    @Test
// Lista con varios elementos y vamos a comprobar si devuelve bien el indice.
    public void indexofVariosElementos() {

        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B","C","D");
        assertEquals(1,mylist.indexOf("A"));

    }

    //Probamos con otro elemento y esta vez para comprobar si el indice que devuelve lo devuelve,
    // bien o no, en este caso es A con indice 1 y vamos a comparar si realmente devuelve 2 o 1.

    @Test
    public void indexofVariosElementos2() {
// Vamos a comrobar si devuelve indice de elemtnos de la lista que no sean los primeros
        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B","C","D");
        assertEquals(2,mylist.indexOf("B"));

    }


    @Test
    public void indexofVariosElementos3() {
// Vamos a comrobar si devuelve indice de elementos que estan en el medio
        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B","C","D");
        assertEquals(3,mylist.indexOf("C"));

    }
    @Test
    public void indexofVariosElementos4() {
// Vamos a comrobar si devuelve indice del ultimo elemento de la lista
        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B","C","D");
        assertEquals(4,mylist.indexOf("D"));

    }

    //Clase invalida:   elemento fuera de rango
    @Test


        public void indexofInvalido2() {
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("A","B");

        Exception exception = assertThrows (IllegalArgumentException.class, () -> miLista.indexOf("C"));

            assertEquals("La posición no puede ser superior al tamaño de la lista", exception.getMessage());
        }




}
