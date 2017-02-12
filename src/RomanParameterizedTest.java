import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RomanParameterizedTest {

	private int arabic;
	private String roman;
	
	public RomanParameterizedTest(int arabic, String roman) {
		this.arabic = arabic;
		this.roman = roman;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{1, "I"},
			{2, "II"},
			{3, "III"},
			{4, "IV"},
			{5, "V"},
			{6, "VI"},
		});
	}
	
	@Test
	public void roman_parameterized() throws Exception {
		RomanConverter rc = new RomanConverter();
		assertEquals(this.roman, rc.convert(arabic));
	}
}
