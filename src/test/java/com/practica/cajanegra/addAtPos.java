package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class addAtPos {
    private SingleLinkedListImpl<String> miLista;
//Esta a medias, lo acabo en casa
    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<>("A","B","C","D","E");
    }

    // Clase valida:   1 < pos <= size()
    @ParameterizedTest(name= "Valid values - Add Element position {0} in list")
    @ValueSource(strings = {"@", "A", "B", "L", "Y", "Z", "["})
    public void addAtPosMinMenos(String a) {
        boolean foundException = false;
        try{
            this.miLista.addAtPos(a, 0);
            foundException=true;
        }
        catch(java.lang.IllegalArgumentException e){

        }
        assertEquals(foundException, true);
    }

    @ParameterizedTest(name= "Valid values - Add Element position {2} in list")
    @ValueSource(strings = {"@", "A", "B", "L", "Y", "Z", "["})
    public void addAtPosMinPlus(String s) {
        String[] salidaEsp = {s, "A","B","C", "D", "E"} ;
        this.miLista.addAtPos(s, 1);
        assertEquals(salidaEsp, this.miLista.toString());
    }

    @ParameterizedTest(name= "Valid values - Add Element position {2} in list")
    @ValueSource(strings = {"@", "A", "B", "L", "Y", "Z", "["})
    public void addAtPosMed(String s) {
        String[] salidaEsp = {s, "A","B","C", "D", "E"} ;
        this.miLista.addAtPos(s, 2);
        assertEquals(salidaEsp, this.miLista.toString());
    }

    @ParameterizedTest(name= "Valid values - Add Element position {1} in list")
    @ValueSource(strings = {"@", "A", "B", "L", "Y", "Z", "["}, ints = {300, Integer.MAX_VALUE-1, Integer.MAX_VALUE})
    public void addAtPosMin(String s, int i) {
        String[] salidaEsp = {"A","B","C", "D", "E", s} ;
        this.miLista.addAtPos(s, i);
        assertEquals(salidaEsp, this.miLista.toString());
    }
    //usar csvSDource porque ValueSource no funciona aqui

    @ParameterizedTest(name= "Valid values - Add Element position {1} in list")
    @ValueSource(strings = {"@", "["}, ints = {1, 2, 3 300, Integer.MAX_VALUE-1, Integer.MAX_VALUE})
    public void addAtPosElemInvalidosindexInvalido(String s, int i) {
        String[] salidaEsp = {"A","B","C", "D", "E", s} ;
        this.miLista.addAtPos(s, i);
        assertEquals(salidaEsp, this.miLista.toString());
    }




}