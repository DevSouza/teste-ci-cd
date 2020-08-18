package br.com.convexus;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConvexusApplicationTests {

	@Test
	void contextLoads() {		
		assertTrue(false);
	}
	
	@Test
	void contextLoads2() {		
		assertTrue(true);
		assertTrue(false);
		assertTrue(true);
	}
	
	@Test
	void contextLoads3() {		
		assertTrue(true);
		assertTrue(false);
		assertTrue(true);
	}

}
