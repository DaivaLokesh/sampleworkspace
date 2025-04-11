package SpringMVC.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test1 {
	App a=new App();
	@Test
	public void testing() {
		assertEquals(5, a.add(2,3),"Error" );
	}
}
