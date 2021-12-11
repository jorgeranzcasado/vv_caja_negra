package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.SingleLinkedListImpl;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class removeLastElementTest {
  private AbstractSingleLinkedListImpl<String> miLista;

    //Clase valida 1. A <= s <= Z â€“ lista vacÃ­a (se lanza excepciÃ³n)
    @ParameterizedTest(name = "Eliminar Elemento {0} de una lista vacia")
    @ValueSource(strings = {"A", "B", "M", "Y", "Z"})
    public void removeElementVal1(String s) {
        this.miLista = new SingleLinkedListImpl<String>();
        assertThrows(EmptyCollectionException.class, () -> {
            this.miLista.removeLast(s);
        });
    }

    //Clase valida 2. A <= s <= Z â€“ s no estÃ¡ en la lista (se lanza excepciÃ³n)
    @Test
    public void removeElementVal2() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertThrows(NoSuchElementException.class, () -> {this.miLista.removeLast("D");});
    }

    //Clase valida 3. A <= s <= Z â€“ s estÃ¡ en la Ãºltima posiciÃ³n de la lista
    @ParameterizedTest( name = "Eliminar Elemento {0} en la ultima pos de una lista")
    @ValueSource( strings = {"A", "B", "M", "Y", "Z"})
    public void removeElementVal3(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C", s);
        assertEquals(s, this.miLista.removeLast(s));
        assertEquals("[A, B, C]", this.miLista.toString());
    }

    //Clase valida 4. A <= s <= Z â€“ s estÃ¡ en la primera posiciÃ³n de la lista
    @ParameterizedTest( name = "Eliminar Elemento {0} en la primera posicion de una lista")
    @ValueSource( strings = {"A", "B", "M", "Y", "Z"})
    public void removeElementVal4(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl<String>(s, "A", "B", "C");
        assertEquals(s, this.miLista.removeLast(s));
        assertEquals("[A, B, C]", this.miLista.toString());
    }

    //Clase valida 5. A <= s <= Z â€“ s estÃ¡ en el centro de la lista
    @ParameterizedTest( name = "Eliminar Elemento {0} en el centro de una lista")
    @ValueSource( strings = {"A", "B", "M", "Y", "Z"})
    public void removeElementVal5(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", s, "C", "D");
        assertEquals(s, this.miLista.removeLast(s));
        assertEquals("[A, B, C, D]", this.miLista.toString());
    }
}
