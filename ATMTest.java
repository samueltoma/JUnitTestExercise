package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {

	private ATM atm;
	
	@Before
	public void setUp() throws Exception {
		atm = new ATM();
	}

	@After
	public void tearDown() throws Exception {
		atm = null;
	}
	
	@Test
	public void testGetBalance() {
		double expected = 0;
		double actual = atm.getBalance();
		assertEquals(expected,actual,0.0000001);
	}
	
	@Test
	public void testDeposit() {
		atm.deposit(10);
		double expected = 10.0;
		double actual = atm.getBalance();
		assertEquals(expected, actual,0.000001);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testDepositException() {
		atm.deposit(-10);
	}
	
	@Test
	public void testToString() {
		String expected = "Amount balance is $0.00";
		String actual = atm.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWithdraw() {
		atm.deposit(50);
		double expected = 10;
		double actual = atm.withdraw(10);
		assertEquals(expected,actual,0.0000001);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testWithdrawException() {
		atm.withdraw(10);
	}
}
