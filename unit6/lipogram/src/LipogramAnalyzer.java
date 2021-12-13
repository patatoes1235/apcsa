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
		while (placeHolderText.indexOf("\n") >-1) {
			placeHolderText.replace('\n', ' ');
		}
		while (placeHolderText.indexOf("\t") > -1) {
			placeHolderText.replace('\t', ' ');
		}
		String[] newText = placeHolderText.split(" ");
		for (int i = 0; i < newText.length; i++) {
			if (newText[i].indexOf(letter) > -1 && !returnString.contains(newText[i])) {
				returnString+=newText[i] + "\n";
			}
		}
		return returnString;
	}
}
