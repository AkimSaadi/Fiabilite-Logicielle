package essai;

public class Essai {
    private double val;

    public Essai(double val){
        this.val=val;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }
    public void ajouter (double v){
        val +=v;
    }
    public double inverserVal (){
        if (val == 0.0){
            throw new IllegalArgumentException("L'inversion sur 0 est impossible");
        }
        return 1/val;
    }
    public double infinite(){
        while (true){
        }
    }
}
