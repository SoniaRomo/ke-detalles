
package com.Apiproyecto.service;

import java.util.List;
import java.util.Optional;
import com.Apiproyecto.entity.TipoUsuario;

public interface TipoUsuarioService {

    public List<TipoUsuario> findAll();

    public List<TipoUsuario> findALLCustom();

    public Optional<TipoUsuario> findById(Integer id);

    public  TipoUsuario add( TipoUsuario t);

    public TipoUsuario update(TipoUsuario t);

    public void delete(TipoUsuario t);
}

