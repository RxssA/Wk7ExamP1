package ie.atu.week7exam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderStorage {
    public int getOrderId;
    public int getProductId;
    public int getCustomerId;
    public int getQuantity;
    private int orderId;

    private int productId;

    private int quantity;

    private int customerId;

}
