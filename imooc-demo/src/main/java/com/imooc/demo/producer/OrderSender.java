package com.imooc.demo.producer;

import com.imooc.demo.entity.Area;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(Area area) throws Exception {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(area.getAreaId().toString());
        rabbitTemplate.convertAndSend("order_exchange", "order.abcd", area, correlationData);
    }
}
