package com.h2.H2api.servicio;

import com.h2.H2api.modelo.Usuario;

public interface ServicioUsuario {
    Usuario guardarUsuario(Usuario usuario);
    Usuario obtenerUsuario(Long idUsuario);

    Usuario usuarioAModificar(Long id, Usuario usuarioModificar);
    boolean eliminarUsuario(Long idUsuario);
}
