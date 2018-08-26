package com.dsp.code.apidsp.recursos;

import com.dsp.code.apidsp.dominio.NuevoUsuarioRequest;
import com.dsp.code.apidsp.dominio.Usuario;
import com.dsp.code.apidsp.repositorios.RepositorioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

@RestController
@RequestMapping("/usuario")
public class RecursoUsuarios {

    private RepositorioUsuarios repositorioUsuarios;

    @Autowired
    public RecursoUsuarios(RepositorioUsuarios repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    @RequestMapping("/get/all")
    public List<Usuario> retornarUsuarios() {

        return repositorioUsuarios.findAll();
    }

    @RequestMapping("/get")
    public Usuario retornarUsuarioPorId(@RequestParam Long id) {
        Optional<Usuario> user = repositorioUsuarios.findById(id);
        final Predicate notEmptyUser = o -> o != null;
        final Predicate userInstance = o -> o instanceof Usuario;

        return (Usuario) user.filter(notEmptyUser).filter(userInstance).get();
    }

    @PostMapping("/add")
    public String agregarUsuario(@RequestBody NuevoUsuarioRequest nuevoUsuarioRequest) {
        repositorioUsuarios.save(Usuario.builder()
                .nombreUsuario(nuevoUsuarioRequest.getNombreUsuario())
                .build());

        return "Usuario Guardado correctamente ";
    }
}
