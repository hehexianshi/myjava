import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 李冬
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 18611693075
 * @created 2020/02/20 23:07
 * @changeRecord
 */

public class san {

    public static void main(String[] args) {
        String count = "100.01";
        BigDecimal bigDecimal = new BigDecimal(count);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.intValue());

        BigDecimal multiply = bigDecimal.multiply(new BigDecimal(100));
        System.out.println(multiply.intValue());
    }
}
