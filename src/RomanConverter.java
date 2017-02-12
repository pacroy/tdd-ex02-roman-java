
public class RomanConverter {

	public String convert(int i) {
		String output = "";
		
		while (i > 0) {
			output += "I";
			i -= 1;
		}

		return output;
	}

}
