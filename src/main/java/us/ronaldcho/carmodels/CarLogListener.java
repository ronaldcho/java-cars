package us.ronaldcho.carmodels;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CarLogListener
{

    @RabbitListener
    public void receiveMessage(CarLog carlogmessage)
    {
        log.info(" RECEIVED MESSAGE : {} ", carlogmessage.toString());
    }

}
