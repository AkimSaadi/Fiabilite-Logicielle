package triangle;

public class Triangle {
    private double coteA;
    private double coteB;
    private double coteC;

    public int typeTriangle(){
        if (coteA > coteB+coteC || coteB > coteA+coteC || coteC > coteB+coteA || coteA <= 0 || coteB <= 0 || coteC <= 0)
            return -1;
        else if (coteA==coteB && coteA==coteC && coteB==coteC)
            return 3;
        else if (coteA==coteB || coteA==coteC || coteC==coteB)
            return 2;
        else return 1;
    }

    public double getCoteA() {
        return coteA;
    }

    public void setCoteA(double coteA) {
        this.coteA = coteA;
    }

    public double getCoteB() {
        return coteB;
    }

    public void setCoteB(double coteB) {
        this.coteB = coteB;
    }

    public double getCoteC() {
        return coteC;
    }

    public void setCoteC(double coteC) {
        this.coteC = coteC;
    }
}
