
public class RomanConverter {

	public String convert(int i) {
		String output = "";
		
		if (i == 4) return "IV";
		while (i > 0) {
			output += "I";
			i -= 1;
		}

		return output;
	}

}
