package com.seyda.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerFindAllResponseDto {
    String name;
    String lastname;
    String phoneNumber;
    String mail;
    String address;
}
