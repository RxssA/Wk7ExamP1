package ie.atu.week7exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
        private CreateOrder createOrder;
        private GetOrderById getOrderById;
        @Autowired
        public OrderService(){
            this.createOrder = new CreateOrder();
        }
        @Autowired
        public void GetOrderById(){
            this.getOrderById = new GetOrderById();

        }

}
