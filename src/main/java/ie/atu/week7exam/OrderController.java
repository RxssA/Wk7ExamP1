package ie.atu.week7exam;

import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @PostMapping("user")
    public OrderStorage getUser(@RequestBody OrderStorage orderStorage)
    {
        System.out.println("order ID "+ orderStorage.getOrderId);
        System.out.println("product ID "+ orderStorage.getProductId);
        System.out.println("quantity "+ orderStorage.getQuantity);
        System.out.println("customer ID "+ orderStorage.getCustomerId);
        return orderStorage;
    }
}
