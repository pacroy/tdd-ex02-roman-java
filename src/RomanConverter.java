
public class RomanConverter {

	public String convert(int i) {
		String output = "";
		
		if (i >= 5) return "V";
		if (i >= 4) return "IV";
		while (i >= 1) {
			output += "I";
			i -= 1;
		}

		return output;
	}

}
