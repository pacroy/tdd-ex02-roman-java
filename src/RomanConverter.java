
public class RomanConverter {

	public String convert(int i) {
		String output = "";
		
		if (i >= 5) { 
			output += "V";
			i -= 5;
		}
		if (i >= 4) {
			output += "IV";
			i -= 4;
		}
		while (i >= 1) {
			output += "I";
			i -= 1;
		}

		return output;
	}

}
