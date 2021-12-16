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
		//replace newlines and tabs with spaces
		String placeHolderText = text;
		placeHolderText = placeHolderText.replace('\n', ' ');
		placeHolderText = placeHolderText.replace('\t', ' ');
		String[] newText = placeHolderText.split(" ");
		for (int i = 0; i < newText.length; i++) {
			newText[i] = trimSpecialChar(newText[i]);
			if (newText[i].indexOf(letter) > -1 && !returnString.contains(newText[i])) {
				returnString+=newText[i] + "\n";
			}
		}
		return returnString;
	}
	private String trimSpecialChar(String string) {
		if (string.length() < 1) return string;
		// Remove special characters before the string
		int charValue = string.codePointAt(0);
		while (charValue < 65 || (charValue > 90 && charValue < 97) || charValue > 122) {
			string = string.substring(1);
			charValue = string.codePointAt(0);
		}
		//Remove special character after the string
		charValue = string.codePointAt(string.length()-1);
		while (charValue < 65 || (charValue > 90 && charValue < 97) || charValue > 122) {
			string = string.substring(0, string.length()-1);
			charValue = string.codePointAt(string.length()-1);
		}
		return string;
	}
}
