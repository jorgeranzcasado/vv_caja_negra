package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import com.cajanegra.AbstractSingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cajanegra.SingleLinkedListImpl;

public class addFirstTest {
    private AbstractSingleLinkedListImpl<String> lista;

    @BeforeEach
    public void setUp() {
        lista = new SingleLinkedListImpl<>("A", "B", "C");
    }

    //Clase válida (s >= "A", s <="Z")
    @ParameterizedTest(name="Add First {0} in List")
    @ValueSource(strings = {"A", "B", "C", "X", "Z"})
    public void testaddFirst(String s){
        lista.addFirst(s);
        assertEquals("["+s+", A, B, C]", lista.toString());
    }

    //Clase inválida (s<"A")
    @Test
    public void testaddFirstIn1() {
        lista.addFirst("@");
        assertEquals("[A, B, C]", lista.toString());
    }

    //Clase inválida (s>"Z")
    @Test
    public void testaddFirstIn2() {
        lista.addFirst("[");
        assertEquals("[A, B, C]", lista.toString());
    }

}
