
public class RomanConverter {

	public String convert(int input) {
		String output = "";
		int[] arabic = { 10, 5, 1 };
		String[] roman = { "X", "V", "I" };
		
		for (int i=0; i<arabic.length; i++) {
			while (input >= arabic[i]) { 
				if (i > 0) {
					int special_num = arabic[i-1] - arabic[2];
					if (input == special_num) {
						output += (roman[2] + roman[i-1]);
						input -= special_num;
						continue;
					} 
				}
				output += roman[i];
				input -= arabic[i];
			}
		}

		return output;
	}

}
