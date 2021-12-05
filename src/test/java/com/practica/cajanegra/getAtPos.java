package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class getAtPos {
    private SingleLinkedListImpl<String> miLista;

    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<>("A","B","C","D","E");
    }

    //Clase invalida:   pos <= 0
    @Test
    void getAtPostInvalido0() {
        assertThrows(IllegalArgumentException.class, () -> this.miLista.getAtPos(0));
    }
    // Clase valida:   0 < pos <= size()
    @ParameterizedTest(name= "Valid values - Get position {0} in list")
    @ValueSource(ints = {1,2,3,4,5})
    public void getAtPostValidos(int n) {
        String[] salidaEsp = {"A", "B", "C", "D", "E"};
        assertEquals(salidaEsp[n-1], this.miLista.getAtPos(n));
    }

    //Clase invalida:   pos > size()
    @Test
    void getAtPostInvalido6() {
        assertThrows(IllegalArgumentException.class, () -> this.miLista.getAtPos(6));
    }
}
