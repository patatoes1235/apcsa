public class Haiku extends Poem{
    int[] syllables = {5, 7, 5};
    public int numLines() {
        return syllables.length;
    }
    public int getSyllables(int i) {
        return syllables[i-1];
    }
}
