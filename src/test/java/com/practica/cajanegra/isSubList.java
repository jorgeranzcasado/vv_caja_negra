package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cajanegra.AbstractSingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class isSubList {
    private AbstractSingleLinkedListImpl<String> lista;

    @BeforeEach
    public void setUp(){
        this.lista = new SingleLinkedListImpl<String>("A","B","C"); //Varios elementos
    }
    @Test
    public void testIsSubList(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("A","B","C");
        assertEquals(miLista.isSubList(this.lista), 1);
    }

    @Test
    public void testIsSubListPeq(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("B","C");
        assertEquals(this.lista.isSubList(miLista), 2);
    }

    @Test
    public void testIsSubListPeq2(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("C");
        assertEquals(this.lista.isSubList(miLista), 3);
    }

    @Test
    public void testVacio(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("X","Z");
        assertEquals(miLista.isSubList(this.lista), -1);
    }

}
