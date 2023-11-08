package ie.atu.week7exam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping("{orderId}/{productId}/{quantity}/{customerId}")
    public String getUser(@PathVariable int orderId, @PathVariable int productId, @PathVariable int quantity, @PathVariable int customerId)
    {
        return "orderId " + orderId + "productId " + productId + " quantity" + quantity + "customerId " + customerId;
    }
}
