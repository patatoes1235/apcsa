public class ApproxSinX {
    int degree;
    public ApproxSinX(int n) {
        degree = n;
    }
    public void setDegree(int n) {
        degree = n;
    }
    @Override
    public String toString() {
        StringBuffer returnString = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        if (degree >0) {
            returnString.append("x");
            temp.append("x");
        }
        else return "Invalid number";
        for (int i =3; i <=degree; i+=2) {
            if ((i+1)%4 !=0) {
                temp.append(" + ");
                returnString.append(" + ");
            }
            else {
                temp.append(" - ");
                returnString.append(" - ");
            }
            returnString.append("(x^" + i + " / " + i+"!)");
            temp.append("(x^" + i + " / " + factorial(i) + ")");
        }
        returnString.append("\nor\n");
        returnString.append(temp);
        return returnString.toString();
    }
    private long factorial(int n) {
        long total = 1;
        for (int i = 2; i <= n; i++) {
            total *= i;
        }
        return total;
    }
}
