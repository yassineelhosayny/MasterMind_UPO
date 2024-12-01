package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codice.Giudice;

class GiudiceTest {

    
	@Test
	void testValidaLunghezza () {
	assertTrue(Giudice.valida("3617"));
	assertFalse(Giudice.valida("361789"));
	assertFalse(Giudice.valida("36"));
	assertFalse(Giudice.valida("" ));
	assertTrue(Giudice.valida("3124"));
	}
    
	@Test
	void testValidaCaratteri () {
	assertTrue(Giudice.valida("3617"));
	assertFalse(Giudice.valida("567!" ));
	assertFalse(Giudice.valida("ab%t"));
	assertTrue(Giudice.valida("3124"));
	}
	@Test
	void testValidaNonRipetuti() {
		 assertTrue(Giudice.valida("3617"));
		 assertFalse(Giudice.valida("9923"));
		 assertFalse(Giudice.valida("5667"));
		 assertFalse(Giudice.valida("1233"));
		 
		 assertFalse(Giudice.valida("1010"));
		 assertFalse(Giudice.valida("1981"));
		 assertFalse(Giudice.valida("9551"));
		 assertFalse(Giudice.valida("1510"));
		 assertTrue(Giudice.valida("1234"));
		
	}
	
	@Test
	void testvalidaNumBulls(){
	assertEquals(0, Giudice.numBulls("1274", "5618"));
    assertEquals(1, Giudice.numBulls("1234", "1876"));
    assertEquals(1, Giudice.numBulls("1234", "9874"));
    assertEquals(1, Giudice.numBulls("1234", "9243"));
    assertEquals(1, Giudice.numBulls("9876", "5573"));
    assertEquals(2, Giudice.numBulls("1234", "1256"));
    assertEquals(2, Giudice.numBulls("1234", "1537"));
    assertEquals(2, Giudice.numBulls("1234", "1764"));
    assertEquals(2, Giudice.numBulls("1234", "8237"));
    assertEquals(2, Giudice.numBulls("1234", "9834"));
    assertEquals(3, Giudice.numBulls("9264", "9261"));
    assertEquals(3, Giudice.numBulls("9264", "9284"));
    assertEquals(3, Giudice.numBulls("9264", "9764"));
    assertEquals(3, Giudice.numBulls("9264", "5264"));
    assertEquals(4, Giudice.numBulls("9264", "9264"));
    assertEquals(4, Giudice.numBulls("8725", "8725"));
	}
	
	
	@Test 
	void testnumMaggots(){
		assertEquals(0, Giudice.numMaggots("1274", "5638"));
	    assertEquals(1, Giudice.numMaggots("1234", "8176"));
	    assertEquals(1, Giudice.numMaggots("1234", "9134"));
	    assertEquals(2, Giudice.numMaggots("1234", "9243")); 
	    assertEquals(1, Giudice.numMaggots("9876", "5583"));
	    assertEquals(2, Giudice.numMaggots("1234", "2156"));
	    assertEquals(2, Giudice.numMaggots("1234", "3517"));
	    assertEquals(2, Giudice.numMaggots("1234", "7146"));
	}
	
}

