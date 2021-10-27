package com.practica.cajanegra;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

class isEmpty {
	
	//Probamos con lista vacía
	@Test
	public void testEmpty() {
		  SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
		  
		 // miLista.addLast(null);
		  assertTrue(miLista.isEmpty());
		}
	
	//Probamos con un elemto
	@Test
	public void testElemt() {
		  SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
		  
		  miLista.addLast("A");
		  assertTrue(!miLista.isEmpty());
		}
	
	//Probamos con varios elemtos
	@Test
	public void testElemts() {
		  SingleLinkedListImpl<String> miLista = new SingleLinkedListImpl<String>();
		  
		  miLista.addLast("ABC");
		  assertTrue(!miLista.isEmpty());
		}
}
