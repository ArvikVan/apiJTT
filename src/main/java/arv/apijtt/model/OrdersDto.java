package arv.apijtt.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
@Data
public class OrdersDto {
    private Long client_id;
    private Long price;

    public Orders to() {
        Orders order = new Orders();
        order.setPrice(price);
        order.setCreated(LocalDateTime.now());
        return order;
    }

    public static OrdersDto from(Orders order) {
        OrdersDto orderDto = new OrdersDto();
        orderDto.setPrice(order.getPrice());
        orderDto.setClient_id(order.getClients().getId());
        return orderDto;
    }
}
