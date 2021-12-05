package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import com.cajanegra.AbstractSingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class addLast {
    private AbstractSingleLinkedListImpl<String> miLista;

    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<>("A", "B", "C", "D", "E");
    }

    // Clase valida:   A - Z
    @ParameterizedTest(name = "Valid values - Add Last robust test")
    @ValueSource(strings = {"@", "A", "B", "L", "Y", "Z", "["})
    public void addLastTest(String s) {
        this.miLista.addLast(s);
        String salidaEsp = "[A, B, C, D, E, "+ s + "]";
        assertEquals(salidaEsp, this.miLista.toString());
    }
}
