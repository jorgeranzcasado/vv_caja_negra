package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.*;
import com.cajanegra.AbstractSingleLinkedListImpl;


public class removeLastTest {


    @Test

    public void testremovelast() throws EmptyCollectionException {
// Si hay varios elementos en la lista, tambien lo elimina?
        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B","C","D");
        assertEquals("D",mylist.removeLast());


    }


    @Test
    public void testRemovelastUnElemento() throws EmptyCollectionException {
//probamos con un elemento de la lista
        SingleLinkedListImpl<String> miList = new SingleLinkedListImpl<String>("C");
        // La lista deja añadir valores fuera de rango que es de A hasta Z, en este caso deja enteros
        assertTrue(miList.removeLast()=="C");
        System.out.println(miList);
    }



    @Test
    // Probamos con varios elementos si elimina el ultimo elemento si tenemos la lista con mas de un elemento
    public void testremoveLastVariosElementos() throws EmptyCollectionException{
        SingleLinkedListImpl<String> miList = new SingleLinkedListImpl<String>("A","B","Z");
        assertEquals("Z",miList.removeLast());
        System.out.println(miList);

    }

    // Si la lista esta vacia salta la excepcion de que la lista esta vacia.
    @Test
    public void testRemovelastVACIO() {

        SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();
        // assertEquals("Z",mylist.removeLast());
        Exception exception = assertThrows(com.cajanegra.EmptyCollectionException.class, () -> mylist.removeLast());
        assertEquals("La colecci\u00f3n La lista est\u00e1 vac\u00eda est\u00e1 vac\u00eda.", exception.getMessage());

        // Si es una lista vacia entonces salta la excepcion que esta vacio.


    }
}
