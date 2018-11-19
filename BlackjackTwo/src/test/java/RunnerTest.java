import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RunnerTest {
	
	private Runner run;
	
	@Before
	public void setUp() {
		run = new Runner();	
	}
	
	@Test
	public void PlayTest() {
		assertEquals(10, run.Play(10, 22));
		assertEquals(14, run.Play(9, 14));
		assertEquals(0, run.Play(22, 22));
		assertEquals(19, run.Play(22, 19));
		assertEquals(18, run.Play(18, 5));
	}

}