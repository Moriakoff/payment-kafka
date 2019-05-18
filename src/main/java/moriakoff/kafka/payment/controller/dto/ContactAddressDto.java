package moriakoff.kafka.payment.controller.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactAddressDto {

    private String city;
    private String region;
    private String country;
    private String houseNumber;
    private String apartmentNumber;
}
