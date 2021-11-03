package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
// Probamos si saca el indice del elemento
public class indexofTest {

    @DisplayName("Probando si vuelve bien la posicion")
    @Test

    public void testindexof() {

        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B","C","D");
        assertEquals(2,mylist.indexOf("B"));

    }

    //Probamos con otro elemento y esta vez para comprobar si el indice que devuelve lo devuelve bien o no, en este caso es A con indice 1 y vamos a comparar si realmente devuelve 2 o 1.
    @DisplayName("Ahora vemos que si vuelve siempre la misma posicion o no")

    @Test
    public void testindexof1() {

        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B","C","D");
        assertEquals(2,mylist.indexOf("A"));

    }

}
