
public class RomanConverter {

	public String convert(int input) {
		String output = "";
		int[] arabic = { 5, 4, 1 };
		String[] roman = { "V", "IV", "I" };
		
		for (int i=0; i<arabic.length; i++) {
			while (input >= arabic[i]) { 
				output += roman[i];
				input -= arabic[i];
			}
		}

		return output;
	}

}
