public class Limerick extends Poem{
    private int[] syllables = {9,9,6,6,9};
    public int numLines() {
        return syllables.length;
    }
    public int getSyllables(int i) {
        return syllables[i-1];
    }
}
