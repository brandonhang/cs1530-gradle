import org.junit.Test;
import static org.junit.Assert.*;

import sequences.Illuminati;

public class IlluminatiTest {
	
	@Test
	public void testTriangleNormal() {
		
		assertEquals(Illuminati.triangleNumber(8), 36);
		assertEquals(Illuminati.triangleNumber(23), 276);
		assertEquals(Illuminati.triangleNumber(786), 309291);
	}
	
	@Test
	public void testTriangleMin() {
		
		assertEquals(Illuminati.triangleNumber(1), 1);
	}
	
	@Test
	public void testTriangleMax() {
		
		assertEquals(Illuminati.triangleNumber(2147483647), 2305843008139952128);
	}
	
	@Test
	public void testTriangleNegative() {
		
		assertEquals(Illuminati.triangleNumber(-888), -1);
	}
	
	@Test
	public void testTriangleEdgeNegative() {
		
		assertEquals(Illuminati.triangleNumber(0), -1);
	}
	
	@Test
	public void testLazyNormal() {
		
		assertEquals(Illuminati.lazyCaterer(8), 37);
		assertEquals(Illuminati.lazyCaterer(23), 277);
		assertEquals(Illuminati.lazyCaterer(786), 309292);
	}
	
	@Test
	public void testLazyMin() {
		
		assertEquals(Illuminati.lazyCaterer(0), 1);
	}
	
	@Test
	public void testLazyMax() {
		
		assertEquals(Illuminati.lazyCaterer(2147483647), 2305843008139952129);
	}
	
	@Test
	public void testLazyNegative() {
		
		assertEquals(Illuminati.lazyCaterer(-888), -1);
	}
	
	@Test
	public void testLazyEdgeNegative() {
		
		assertEquals(Illuminati.lazyCaterer(-1), -1);
	}
}