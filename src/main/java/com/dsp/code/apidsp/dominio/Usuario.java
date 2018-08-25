package com.dsp.code.apidsp.dominio;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario extends Persona {
    private String nombreUsuario;
    private TipoUsuario tipoUsuario;
}
