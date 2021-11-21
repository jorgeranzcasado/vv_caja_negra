package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class addAtPos {
    private SingleLinkedListImpl<String> miLista;

    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<>("A","B","C","D","E");
    }

    //Clases válidas para string s: A-Z
    @ParameterizedTest(name= "Valid values - Add Element position {0} in list")
    @ValueSource(strings = {"@", "A", "B", "L", "Y", "Z", "["})
    public void addAtPosMinMenos(String s) {
        boolean foundException = false;
        try{
            this.miLista.addAtPos(s, 0);
        }
        catch(java.lang.IllegalArgumentException e){
            foundException=true;
        }
        assertTrue(foundException);
    }

    @ParameterizedTest(name= "Valid values - Add Element position {1} in list")
    @ValueSource(strings = {"@", "A", "B", "L", "Y", "Z", "["})
    public void addAtPosMin(String s) {
        String salidaEsp = "[" + s + ", A, B, C, D, E]";
        this.miLista.addAtPos(s, 1);
        assertEquals(salidaEsp, this.miLista.toString());
    }

    @ParameterizedTest(name= "Valid values - Add Element position {2} in list")
    @ValueSource(strings = {"@", "A", "B", "L", "Y", "Z", "["})
    public void addAtPosMinMas(String s) {
        String salidaEsp = "[A, " + s + ", B, C, D, E]";
        this.miLista.addAtPos(s, 2);
        assertEquals(salidaEsp, this.miLista.toString());
    }

    // Clases validas para index i:   1 < pos <= size()
    @ParameterizedTest(name= "Valid values - Add Element in last position in list")
    @CsvFileSource(files = "datosMedMax-Max.csv")
    public void addAtPosElemIndexMayor(String s, int i) {
        String salidaEsp = "[A, B, C, D, E, " + s +"]";
        this.miLista.addAtPos(s, i);
        assertEquals(salidaEsp, this.miLista.toString());
    }




}