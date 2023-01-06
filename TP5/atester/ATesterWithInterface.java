package temperature;

import temperature.MockConversion;

/**classe qui contient
 * un attribut privé de type IConversion
 * une méthode Double convertit(Double temperature, String sens) qui
 * prend une temperature, une chaine qui est F2C ou C2F et retourne la conversion
 * de température en Celsius ou Farenheit.
 *
 *@authors Reda CHANAA, Mohamed TAKHCHI, Zakari IKHOU, Sohaib ELMOUHTADI, Akim SAADI
 */
public class ATesterWithInterface {
    IConversion conv;
    public ATesterWithInterface( IConversion conversion){
        this.conv = conversion;
    }
    public Double convertit(Double temperature, String sens) throws Exception {
        if (sens.equals("F2C")) {
            return conv.convF2C(temperature);
        } else if (sens.equals("C2F")) {
            return conv.convC2F(temperature);
        }
        System.out.println("Erreur du String Sens");
        return -1.0;
    }
}