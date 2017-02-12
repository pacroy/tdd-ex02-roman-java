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
	
	@Test
	public void should_get_iv_when_4() {
		RomanConverter roman = createNewRomanConverter();
		assertEquals("IV", roman.convert(4));
	}
	
	@Test
	public void should_get_v_when_5() {
		RomanConverter roman = createNewRomanConverter();
		assertEquals("V", roman.convert(5));
	}
	
	@Test
	public void should_get_vi_when_6() {
		RomanConverter roman = createNewRomanConverter();
		assertEquals("VI", roman.convert(6));
	}

}
