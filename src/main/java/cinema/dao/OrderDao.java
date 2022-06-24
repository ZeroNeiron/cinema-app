package cinema.dao;

import java.util.List;
import cinema.model.User;
import cinema.model.Order;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
