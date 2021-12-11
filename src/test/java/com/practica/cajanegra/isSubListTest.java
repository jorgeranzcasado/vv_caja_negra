package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import com.cajanegra.AbstractSingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class isSubListTest {
    private AbstractSingleLinkedListImpl<String> lista;

    @BeforeEach
    public void setUp(){
        this.lista = new SingleLinkedListImpl<String>("A","B","C","D","X","Y");//Varios elementos
    }
    @Test
    public void testIsSubListPeq(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("A", "B");
        assertEquals(1, this.lista.isSubList(miLista));
    }
    @Test
    public void testIsSubListPeq1(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("B","C","D");
        assertEquals(2, this.lista.isSubList(miLista));
    }

    @Test
    public void testIsSubListPeq3(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("C","D");
        assertEquals(3, this.lista.isSubList(miLista));
    }

    @Test
    public void testNoIsSubList(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("B", "A");
        assertEquals(-1, this.lista.isSubList(miLista));
    }

    @Test
    public void testIsSubListPeq4(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("D", "X", "Y");
        assertEquals(4, this.lista.isSubList(miLista));
    }

    @Test
    public void testIsSubListPeq5(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("X","Y");
        assertEquals(5, this.lista.isSubList(miLista));
    }

    @Test
    public void testIsSubListPeq6(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("Y");
        assertEquals(6, this.lista.isSubList(miLista));
    }
    @Test
    public void testIsSubListVacia(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
        assertEquals(0, this.lista.isSubList(miLista));
    }

    // Test unico para lista null
    @Test
    public void testIsSubListSinElementos(){
        this.lista = new SingleLinkedListImpl<String>(); //Sin elementos
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
        assertEquals(this.lista.isSubList(miLista), 0);
    }
}
