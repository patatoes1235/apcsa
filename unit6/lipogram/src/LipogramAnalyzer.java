public class LipogramAnalyzer {
	private String text;
	public LipogramAnalyzer(String text) {
		this.text = text;
	}
	public String mark(char letter) {
		String newText = text;
		while (newText.indexOf(letter) > -1) {
			newText = newText.replace(letter, '#');
		}
		return newText;
	}
	public String allWordsWith(char letter) {
		String returnString = "";
		String[] newText = text.split(" ");
		for (int i = 0; i < newText.length; i++) {
			if (newText[i].indexOf(letter) > -1 && !returnString.contains(newText[i])) {
				returnString+=trimSpecialChar(newText[i]) + "\n";
			}
		}
		return returnString;
	}
	private String trimSpecialChar(String string) {
		// Remove special characters before the string
		int charValue = string.codePointAt(0);
		while (charValue < 65 || (charValue > 90 && charValue < 97) || charValue > 122) {
			string = string.substring(1);
			charValue = string.codePointAt(0);
		}
		//Remove special character after the string
		charValue = string.codePointAt(string.length()-1);
		System.out.println(string + charValue);
		while (charValue < 65 || (charValue > 90 && charValue < 97) || charValue > 122) {
			System.out.println(string);
			string = string.substring(0, string.length()-1);
			charValue = string.codePointAt(string.length()-1);
		}
		return string;
	}
}
