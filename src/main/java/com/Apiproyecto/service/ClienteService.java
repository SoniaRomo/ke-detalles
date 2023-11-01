
package com.Apiproyecto.service;

import com.Apiproyecto.entity.Cliente;
import java.util.List;
import java.util.Optional;


public interface ClienteService {
  public List<Cliente> findAll();

    public List<Cliente> findALLCustom();

    public Optional<Cliente> findById(Integer id);

    public Cliente add(Cliente c);

    public Cliente update(Cliente c);

    public Cliente delete(Cliente c);   
}
