package hpe.octanecodecoveragedemo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import hpe.octanecodecoveragedemo.Fibonacci;

public class FibonacciTest   {
	
	Random ran = new Random();
	int totalNumber = ran.nextInt(25) + 1;
	
	//int totalNumber = 20;
	 
	@Test
	public void testCheckFibonacciRecursion() {
		Fibonacci.fibonacciRecusion(totalNumber);
	}
 
	@Test
	public void testCheckFibonacciLoop() {
		Fibonacci.fibonacciLoop(totalNumber);
	}

}

