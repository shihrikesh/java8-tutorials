package classroom.orderScenario;

import java.time.LocalDateTime;
import java.util.List;

public record Order (Integer orderId, List<Product> products,
                     double totalValue, LocalDateTime orderTime){

}
