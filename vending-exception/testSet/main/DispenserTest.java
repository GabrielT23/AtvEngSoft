package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DispenserTest {
	
	Dispenser dispenser;
	@Before
	public void setUp() throws Exception {
		dispenser = new Dispenser();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executa depois");
	}
	@Test
	public void deveRetornarPrecoTest() {
		assertEquals(50, dispenser.dispense(50, 13));
	}
	@Test
	public void deveRetornarFalseAvaliableTest() {
		assertFalse(dispenser.available(18));
	}
}
