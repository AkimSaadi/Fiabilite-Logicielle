package temperature;

public class MockConversion implements IConversion {
    public double convF2C (Double temp){
        if (temp == 32.0){
            return 0.0;
        }
        if (temp == 212.0){
            return 100.0;
        }
        return 0;
    }
    public double convC2F (Double temp) {
        if (temp == 37.0){
            return 98.6;
        }
        if (temp == -40.0){
            return -40.0;
        }
        return 0;
    }
}
