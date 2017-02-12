
public class RomanConverter {

	public String convert(int input) {
		String output = "";
		int[] arabic = { 10, 5, 1 };
		String[] roman = { "X", "V", "I" };
		
		for (int i=0; i<arabic.length; i++) {
			while (input >= arabic[i]) { 
				if ((i > 0) && (input == arabic[i-1] - arabic[2])) {
					output += (roman[2] + roman[i-1]);
					input -= (arabic[i-1] - arabic[2]);
				} else {
					output += roman[i];
					input -= arabic[i];
				}
			}
		}

		return output;
	}

}
