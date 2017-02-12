
public class RomanConverter {

	public String convert(int input) {
		String output = "";
		int[] arabic = { 10, 9, 5, 4, 1 };
		String[] roman = { "X", "IX", "V", "IV", "I" };
		
		for (int i=0; i<arabic.length; i++) {
			while (input >= arabic[i]) { 
				output += roman[i];
				input -= arabic[i];
			}
		}

		return output;
	}

}
