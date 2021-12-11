package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cajanegra.AbstractSingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class reverseTest {

    private AbstractSingleLinkedListImpl<String> lista;

    //Probamos su funcionamiento
    @Test
    public void testReverse(){
        this.lista = new SingleLinkedListImpl<String>("A","B","C");
        this.lista = this.lista.reverse();
        assertEquals("[C, B, A]", this.lista.toString());
    }
    //Probamos con un elemento
    @Test
    public void testUnElemento(){
        this.lista = new SingleLinkedListImpl<String>("A");
        this.lista = this.lista.reverse();
        assertEquals("[A]", this.lista.toString());
    }
    //Probamos con la lista vacia
    @Test
    public void testVacio(){
        this.lista = new SingleLinkedListImpl<String>();
        this.lista = this.lista.reverse();
        assertEquals("[]", this.lista.toString());
    }
}

