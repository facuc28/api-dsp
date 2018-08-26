package com.dsp.code.apidsp.repositorios;

import com.dsp.code.apidsp.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuarios extends JpaRepository<Usuario, Long> {

}
