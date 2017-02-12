import static org.junit.Assert.*;

import org.junit.Test;

public class RomanConverterTest {
	
	private RomanConverter createNewRomanConverter() {
		return new RomanConverter();
	}
	
	@Test
	public void should_get_i_when_1() {
		RomanConverter roman = createNewRomanConverter();
		assertEquals("I", roman.convert(1));
	}
	
	@Test
	public void should_get_ii_when_2() {
		RomanConverter roman = createNewRomanConverter();
		assertEquals("II", roman.convert(2));
	}
	
	@Test
	public void should_get_iii_when_3() {
		RomanConverter roman = createNewRomanConverter();
		assertEquals("III", roman.convert(3));
	}

}
