package moriakoff.kafka.payment.controller;

import moriakoff.kafka.payment.controller.dto.PaymentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    public KafkaTemplate <String, PaymentDto> paymentDtoKafkaTemplate;

    @PostMapping("payment")
    public void payment(@RequestBody PaymentDto paymentDto) {
        paymentDtoKafkaTemplate.send("paymentTest", paymentDto);
    }


}
