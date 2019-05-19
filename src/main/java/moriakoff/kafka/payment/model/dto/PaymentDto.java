package moriakoff.kafka.payment.model.dto;

import lombok.*;
import moriakoff.kafka.payment.model.type.TransactionType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDto {

    private TransactionType transactionType;
    private Double transactionAmount;
    private ClientInfoDto clientInfoDto;


}
