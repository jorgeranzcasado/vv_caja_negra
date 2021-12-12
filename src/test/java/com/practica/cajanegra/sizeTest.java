package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class sizeTest {

		//Probamos con lista vacía
		@Test
		public void testEmpty() {
			  SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
			  
			 // miLista.addLast(null);
			  assertTrue(miLista.size()== 0);
			}
		
		//Probamos con un elemto
		@Test
		public void testElemt() {
			  SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
			  
			  miLista.addLast("A");
			  assertTrue(miLista.size()==1);
			}
		
		//Probamos con varios elemtos
		@Test
		public void testElemts() {
			  SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
			  
			  miLista.addLast("A");
			  miLista.addLast("B");
			  miLista.addLast("C");
			  assertTrue(miLista.size()==3);
			}

}
