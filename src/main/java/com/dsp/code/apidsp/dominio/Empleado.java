package com.dsp.code.apidsp.dominio;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Empleado extends Usuario {
    private String identifiacionEmpleado;
}
