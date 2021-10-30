package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class getAtPos {
    private SingleLinkedListImpl<String> miLista;

    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<>("A","B","C");
    }

    // Clase valida:   0 < pos <= size()
    @ParameterizedTest(name= "Valid values - Get position {0} in list")
    @ValueSource(ints = {1,2,3})
    public void getAtPostValidos(int n) {
        String[] salidaEsp = {"A","B","C"} ;
        assertEquals(salidaEsp[n-1], this.miLista.getAtPos(n));
    }

    //Clase invalida:   pos <= 0
    @Test
    void getAtPostInvalido1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            this.miLista.getAtPos(0));
        assertEquals("La posición no puede ser menor o igual a cero", exception.getMessage());
    }

    //Clase invalida:   pos > size()
    @Test
    void getAtPostInvalido2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                this.miLista.getAtPos(4));
        assertEquals("La posición no puede ser superior al tamaño de la lista", exception.getMessage());
    }
}
