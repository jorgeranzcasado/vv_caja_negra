package com.practica.cajanegra;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class removeLastTest {
    private AbstractSingleLinkedListImpl<String> mylist;

    @Test
    public void testremovelast() throws EmptyCollectionException {
    // Si hay varios elementos en la lista, tambien lo elimina?
        mylist = new SingleLinkedListImpl<String>("A","B","C","D");
        assertEquals("D", mylist.removeLast());
        assertEquals("[A, B, C]",mylist.toString());
    }

    @Test
    // Probamos con varios elementos si elimina el ultimo elemento si tenemos la lista con mas de un elemento
    public void testremoveLastVariosElementos() throws EmptyCollectionException{
        mylist = new SingleLinkedListImpl<String>("A");
        assertEquals("A", mylist.removeLast());
        assertEquals("[]",mylist.toString());

    }

    // Si la lista esta vacia salta la excepcion de que la lista esta vacia.
    @Test
    public void testRemovelastVACIO() {
        mylist = new SingleLinkedListImpl<String>();
        assertThrows(com.cajanegra.EmptyCollectionException.class, () -> mylist.removeLast());
        // Si es una lista vacia entonces salta la excepcion que esta vacio.
    }
}
