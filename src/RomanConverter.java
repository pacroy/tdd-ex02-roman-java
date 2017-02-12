
public class RomanConverter {

	public String convert(int input) {
		String output = "";
		int[] arabic = { 10, 10-1, 5, 5-1, 1 };
		String[] roman = { "X", "I"+"X", "V", "I"+"V", "I" };
		
		for (int i=0; i<arabic.length; i++) {
			while (input >= arabic[i]) { 
				output += roman[i];
				input -= arabic[i];
			}
		}

		return output;
	}

}
