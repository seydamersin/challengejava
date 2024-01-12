package com.seyda.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerSaveRequestDto {
    String name;
    String lastname;
    String phoneNumber;
    String mail;
    String address;
}
