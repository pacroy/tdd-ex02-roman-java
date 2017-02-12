import static org.junit.Assert.*;

import org.junit.Test;

public class RomanConverterTest {

	@Test
	public void should_get_i_when_1() {
		RomanConverter roman = new RomanConverter();
		assertEquals("I", roman.convert(1));
	}

}
