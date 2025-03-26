package com.pragma.talentpool.application.dto;

import com.pragma.talentpool.domain.model.Rol;
import com.pragma.talentpool.domain.model.TypeDocumentEnum;
import lombok.*;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTORequest {
    private String nameUser;
    private String lastNameUser;
    private TypeDocumentEnum typeDocumentUser;
    private String documentUser;
    private String phoneNumberUser;
    private LocalDate dateBirthUser;
    private String email;
    private String password;  // Solo se envia en request
    private Rol rol;
}
