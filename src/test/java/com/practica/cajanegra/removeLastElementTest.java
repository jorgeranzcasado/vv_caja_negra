package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class removeLastElementTest {
    private SingleLinkedListImpl<String> miLista;

    //Clase valida 1. A <= s <= Z – lista vacía (se lanza excepción)
    @ParameterizedTest(name = "Eliminar Elemento {0} de una lista vacia")
    @ValueSource(strings = {"A", "B", "M", "Y", "Z"})
    public void removeElementVal1(String s) {
        this.miLista = new SingleLinkedListImpl<String>();
        assertThrows(EmptyCollectionException.class, () -> {
            this.miLista.removeLast(s);
        });
    }

    //Clase valida 2. A <= s <= Z – s no está en la lista (se lanza excepción)
    @Test
    public void removeElementVal2() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertThrows(NoSuchElementException.class, () -> {
            this.miLista.removeLast("D");
        });
    }

    //Clase valida 3. A <= s <= Z – s está en la última posición de la lista
    @ParameterizedTest( name = "Eliminar Elemento {0} en la ultima pos de una lista")
    @ValueSource( strings = {"A", "B", "M", "Y", "Z"})
    public void removeElementVal3(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C", s);
        assertEquals(s, this.miLista.removeLast(s));
    }

    //Clase valida 4. A <= s <= Z – s está en la primera posición de la lista
    @ParameterizedTest( name = "Eliminar Elemento {0} en la primera posiciÃ³n de una lista")
    @ValueSource( strings = {"A", "B", "M", "Y", "Z"})
    public void removeElementVal4(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl<String>(s, "A", "B", "C");
        assertEquals(s, this.miLista.removeLast(s));
    }

    //Clase valida 5. A <= s <= Z – s está en el centro de la lista
    @ParameterizedTest( name = "Eliminar Elemento {0} en el centro de una lista")
    @ValueSource( strings = {"A", "B", "M", "Y", "Z"})
    public void removeElementVal5(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", s, "C", "D");
        assertEquals(s, this.miLista.removeLast(s));
    }
}
