public abstract class Poem {
    public abstract int numLines();
    public abstract int getSyllables(int n);
    public void printRhythm() {
        for (int i =1; i<=numLines(); i++) {
            for (int j =1; j< getSyllables(i); j++) {
                System.out.print("ta-");
            }
            System.out.println("ta");
        }
    }

    public static void main(String[] args) {
        Haiku h = new Haiku();
        Limerick l = new Limerick();
        h.printRhythm();
        System.out.println();
        l.printRhythm();
    }
}
