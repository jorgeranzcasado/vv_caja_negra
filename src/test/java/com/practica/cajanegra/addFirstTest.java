package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class addFirstTest {
    private SingleLinkedListImpl<String> miLista;

    public addFirstTest() {
    }

    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl(new String[]{"A", "B", "C"});
    }

    @ParameterizedTest(
        name = "Add First {0} in list"
    )
    @ValueSource(
        strings = {"A", "B", "M", "Y", "Z"}
    )
    public void addFirstValido(String s) {
        this.miLista.addFirst(s);
        Assertions.assertEquals("[" + s + ", A, B, C]", this.miLista.toString());
    }

    @ParameterizedTest(
        name = "Add First {0} in list"
    )
    @ValueSource(
        strings = {"@", "["}
    )
    public void addFirstInvalido(String s) {
        this.miLista.addFirst(s);
        Assertions.assertEquals("[A, B, C]", this.miLista.toString());
    }
}
