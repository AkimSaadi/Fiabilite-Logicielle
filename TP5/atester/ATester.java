package temperature;

/**classe qui contient
 * un attribut privé de type Conversion
 * une méthode Double convertit(Double temperature, String sens) qui
 * prend une temperature, une chaine qui est F2C ou C2F et retourne la conversion
 * de température en Celsius ou Farenheit.
 *
 *@authors Reda CHANAA, Mohamed TAKHCHI, Zakari IKHOU, Sohaib ELMOUHTADI, Akim SAADI
 */
public class ATester {
    Conversion conv;
    public ATester ( Conversion c){
        this.conv = c;
    }
    public Double convertit(Double temperature, String sens) {
        if (sens.equals("F2C")) {
            return conv.convF2C(temperature);
        } else if (sens.equals("C2F")) {
            return conv.convC2F(temperature);
        }
        return 0.0;
    }
}
