public class Diploma {
    String major, name;
    public Diploma(String n, String mjr) {
        name = n;
        major = mjr;
    }
    public String toString() {
        return "This certifies that " + name + "\nhas completed a MOOC in " + major;
    }
}
class DiplomaWithHonors extends Diploma {
    public DiplomaWithHonors(String name, String major) {
        super(name, major);
    }
    public String toString() {
        return super.toString() + "\n*** with honors ***";
    }
}
