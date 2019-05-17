package moriakoff.kafka.payment.controller.dto;

import lombok.*;
import moriakoff.kafka.payment.controller.dto.type.TransactionType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDto {

    private TransactionType transactionType;
    private Double transactionAmount;
    private ClientInfo clientInfo;



}
