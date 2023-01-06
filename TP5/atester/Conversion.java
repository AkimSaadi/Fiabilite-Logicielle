package temperature;

/**classe de service pour ATester qui contient
 * une méthode convF2C qui convertit une température en Farenheit en Celsius
 * une méthode convC2F qui convertit une température en Celsius en Farenheit
 *
 *@authors Reda CHANAA, Mohamed TAKHCHI, Zakari IKHOU, Sohaib ELMOUHTADI, Akim SAADI
 */
public class Conversion {
    public double convF2C (double temp){
        return (temp-32.0) * 5.0 / 9.0;
    }
    public double convC2F (double temp){
        return temp * 9.0 / 5.0 + 32.0;
    }
}
