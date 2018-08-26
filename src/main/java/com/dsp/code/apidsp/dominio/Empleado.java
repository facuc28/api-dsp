package com.dsp.code.apidsp.dominio;

import lombok.*;

@NoArgsConstructor
@Builder
@Getter
@Setter
@AllArgsConstructor
public class Empleado extends Persona{
    private String identifiacionEmpleado;
}
