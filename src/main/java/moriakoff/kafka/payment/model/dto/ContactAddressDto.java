package moriakoff.kafka.payment.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactAddressDto {

    private String city;
    private String street;
    private String country;
    private String houseNumber;
    private String apartmentNumber;
}
