package org.cs.medicservice.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicDTO {

    private Long id;
    @NotBlank
    private String name;
    private String surname;
    @Email
    private String email;
    private String address;
    private String phone;
    private Date birthdate;

}
