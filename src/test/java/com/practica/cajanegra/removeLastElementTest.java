package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class removeLastElementTest {
    private SingleLinkedListImpl<String> miLista;

    public removeLastElementTest() {
    }

    @ParameterizedTest(
        name = "Eliminar Elemento {0} de una lista vacÃ\u00ada"
    )
    @ValueSource(
        strings = {"A", "B", "M", "Y", "Z"}
    )
    public void removeElementVal1(String s) {
        this.miLista = new SingleLinkedListImpl(new String[0]);
        Assertions.assertThrows(EmptyCollectionException.class, () -> {
            this.miLista.removeLast(s);
        });
    }

    @Test
    public void removeElementVal2() {
        this.miLista = new SingleLinkedListImpl(new String[]{"A", "B", "C"});
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            this.miLista.removeLast("D");
        });
    }

    @ParameterizedTest(
        name = "Eliminar Elemento {0} en la Ãºltima posiciÃ³n de una lista"
    )
    @ValueSource(
        strings = {"A", "B", "M", "Y", "Z"}
    )
    public void removeElementVal3(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl(new String[]{"A", "B", "C", s});
        Assertions.assertEquals(s, this.miLista.removeLast(s));
    }

    @ParameterizedTest(
        name = "Eliminar Elemento {0} en la primera posiciÃ³n de una lista"
    )
    @ValueSource(
        strings = {"A", "B", "M", "Y", "Z"}
    )
    public void removeElementVal4(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl(new String[]{s, "A", "B", "C"});
        Assertions.assertEquals(s, this.miLista.removeLast(s));
    }

    @ParameterizedTest(
        name = "Eliminar Elemento {0} en el centro de una lista"
    )
    @ValueSource(
        strings = {"A", "B", "M", "Y", "Z"}
    )
    public void removeElementVal5(String s) throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl(new String[]{"A", "B", s, "C", "D"});
        Assertions.assertEquals(s, this.miLista.removeLast(s));
    }
}
