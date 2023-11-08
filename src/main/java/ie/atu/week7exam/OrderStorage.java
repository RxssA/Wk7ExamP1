package ie.atu.week7exam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderStorage {
    private int orderId;

    private int productId;

    private int quantity;

    private String customerId;

}
