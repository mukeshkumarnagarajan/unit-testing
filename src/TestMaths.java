import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMaths {
	Maths maths;
	
	@BeforeEach
	void setup() {
		maths = new Maths();
		System.out.println("setup method");
	}
	
	@Test
	void test() {
		assertEquals(5, maths.add(2, 3));
	}
	
	@Test
	void test2() {
		assertEquals(3, maths.add(0, 3));
	}
	
	@Test
	void test3() {
		assertThrows(RuntimeException.class, () -> {
		maths.add(5, 3);
		});
	}

}
