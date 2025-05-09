package classroom.orderScenario;

public record Product(Integer productId,String name,
                      String category, int quantity,
                      boolean inStock, double price) {

}
