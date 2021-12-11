package com.practica.cajanegra;
import java.util.ArrayList;
import java.util.stream.Stream;
import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

public class addNTimesTest {

    private SingleLinkedListImpl<String> miLista;
    private ArrayList<String> esperado = new ArrayList<String>();

    @BeforeEach
    public void setUp() {
        this.miLista= new SingleLinkedListImpl<>("A","B","C");
        this.esperado.add("A");
        this.esperado.add("B");
        this.esperado.add("C");
    }

    // Metodo que genera casos de pruebas, producto cartesiano de valores de s y n
    private static Stream<Arguments> provideArgumentsforAddNTimes() {
        String[] s = new String[]{"@","A","B","M","Y","Z","["};
        int[] n = new int[]{-1, 0,1,4,10};

        Stream<Arguments> anStream = Stream.of();

        for(int e=0; e< n.length; e++){
            for (int i=0; i< s.length; i++){
                anStream = Stream.concat(anStream, Stream.of(Arguments.of(s[i],n[e])));
            }
        }
        return anStream;
    }

    @ParameterizedTest(name= "addNTimes ({0}, {1})")
    @MethodSource("provideArgumentsforAddNTimes")
    void addNTimes(String s, int n) {
        char c;
        int ascii = 0;
        if(s.length() == 1) {
            c = s.charAt(0);
            ascii = (int)c;
        }
        if(ascii>64 && ascii<91 && n>=0){
            for(int x=0; x < n ; x++){
                esperado.add(s);
            }
            miLista.addNTimes(s,n);
            assertEquals(esperado.toString(), miLista.toString() );
        } else {
            if (ascii <= 64 || ascii >= 91){
                miLista.addNTimes(s,n);
                assertEquals(esperado.toString(), miLista.toString());
            } else {
                Exception message = assertThrows(IllegalArgumentException.class, () -> this.miLista.addNTimes(s, n));
                System.out.println(message.getMessage());
            }
        }
    }
}
