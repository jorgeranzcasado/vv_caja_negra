package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import com.cajanegra.AbstractSingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class addFirstTest {
    private AbstractSingleLinkedListImpl<String> miLista;

    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
    }

    //Prueba de clases válidas a traves de test parametrizados
    @ParameterizedTest( name = "Add First {0} in list")
    @ValueSource( strings = {"A", "B", "M", "Y", "Z"})
    public void addFirstValido(String s) {
        this.miLista.addFirst(s);
        assertEquals("[" + s + ", A, B, C]", this.miLista.toString());
    }

    //Prueba de clases inválidas a través de test parametrizados
    @ParameterizedTest( name = "Add First {0} in list")
    @ValueSource( strings = {"@", "["})
    public void addFirstInvalido(String s) {
        this.miLista.addFirst(s);
        assertEquals("[A, B, C]", this.miLista.toString());
    }
}
