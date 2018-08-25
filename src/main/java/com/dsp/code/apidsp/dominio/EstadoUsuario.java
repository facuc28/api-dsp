package com.dsp.code.apidsp.dominio;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor (access = AccessLevel.PRIVATE)
public enum EstadoUsuario {
    ACTIVO,
    DESACTIVADO,
    PENDIENTE_VERIFICACION,
}
