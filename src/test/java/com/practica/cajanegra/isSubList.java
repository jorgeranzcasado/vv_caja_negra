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

        this.lista = new SingleLinkedListImpl<String>("A","B","C","D","X","Y");//Varios elementos
        //this.lista = new SingleLinkedListImpl<String>(); //Sin elementos
    }
    @Test
    public void testIsSubList(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("B","C","D");
        assertEquals(this.lista.isSubList(miLista), 2);
    }

    @Test
    public void testIsSubListPeq(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("B","C");
        assertEquals(this.lista.isSubList(miLista), 2);
    }

    @Test
    public void testIsSubListPeq2(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("A", "B");
        assertEquals(this.lista.isSubList(miLista), 1);
    }

    @Test
    public void testIsSubListPeq3(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("B", "A");
        assertEquals(this.lista.isSubList(miLista), -1);
    }

    @Test
    public void testIsSubListPeq4(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("C", "B");
        assertEquals(this.lista.isSubList(miLista), -1);
    }

    @Test
    public void testIsSubListPeq5(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("B");
        assertEquals(this.lista.isSubList(miLista), 2);
    }

    @Test
    public void testIsSubListPeq6(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("");
        assertEquals(this.lista.isSubList(miLista), -1);
    }

    @Test
    public void testIsSubListPeq7(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
        assertEquals(this.lista.isSubList(miLista), 0);
    }

    @Test
    public void testVacio(){
        SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>("X","Z");
        assertEquals(miLista.isSubList(this.lista), -1);
    }

}
