package classroom.orderScenario;

import java.util.List;

public record OrderPlacement(Integer orderId, List<ProductPlacement> productPlacementList) {
}
