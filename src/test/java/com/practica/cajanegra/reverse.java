package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cajanegra.AbstractSingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class reverse {

    private AbstractSingleLinkedListImpl<String> lista;

    @BeforeEach
    public void setUp(){
        this.lista = new SingleLinkedListImpl<String>("A","B","C"); //Varios elementos
        //this.lista = new SingleLinkedListImpl<String>("A"); //Un elemento
        //this.lista = new SingleLinkedListImpl<String>(); //Sin elementos
    }
    //Probamos su funcionamiento
    @Test
    public void testReverse(){
        this.lista = this.lista.reverse();
        assertEquals("[C, B, A]", this.lista.toString());
    }
    //Probamos con un elemento
    @Test
    public void testUnElemento(){
        this.lista = this.lista.reverse();
        assertEquals("[A]", this.lista.toString());
    }
    //Probamos con la lista vacia
    @Test
    public void testVacio(){
        this.lista = this.lista.reverse();
        assertEquals("[]", this.lista.toString());
    }
}

