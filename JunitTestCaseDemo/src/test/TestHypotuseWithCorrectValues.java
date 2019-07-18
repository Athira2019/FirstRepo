import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cerner.demo.TriangleProperties;

class TestHypotuseWithCorrectValues {
	TriangleProperties triangle;
	@BeforeEach
	void setUp() throws Exception {
		 triangle=new TriangleProperties();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testWithCorrectInt() {
	   assertEquals(5,triangle.getHyponuse(1, 2));
	}

	
	@Test
	void testWithCorrectDouble() {
	
	   assertEquals(6.05, triangle.getHypotuneseDouble(2.2, 1.1),0.01);
	}
}
