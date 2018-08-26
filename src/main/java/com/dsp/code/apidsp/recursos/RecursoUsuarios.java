package com.dsp.code.apidsp.recursos;

import com.dsp.code.apidsp.dominio.NuevoUsuarioRequest;
import com.dsp.code.apidsp.dominio.Usuario;
import com.dsp.code.apidsp.repositorios.RepositorioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Usuario> retornarUsuario(@RequestParam Long id) {

        return repositorioUsuarios.findAll();
    }

    @PostMapping("/add")
    public String agregarUsuario(@RequestBody NuevoUsuarioRequest nuevoUsuarioRequest) {
        repositorioUsuarios.save(Usuario.builder()
                .nombreUsuario(nuevoUsuarioRequest.getNombreUsuario())
                .build());

        return "Usuario Guardado correctamente ";
    }
}
