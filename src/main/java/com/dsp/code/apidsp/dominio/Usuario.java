package com.dsp.code.apidsp.dominio;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Usuario extends Persona {

    @Id
    @GeneratedValue
    private long id;
    private String nombreUsuario;
    private TipoUsuario tipoUsuario;
}
