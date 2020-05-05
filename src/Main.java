import java.math.BigDecimal;

public class Main {
    public static void main (String[] args) {
        BigDecimal regularBonus = new BigDecimal("0.3");
        BigDecimal specialBonus = new BigDecimal("0.6");
        BigDecimal totalBonus = regularBonus.add(specialBonus);
        System.out.println(totalBonus);
    }
}
