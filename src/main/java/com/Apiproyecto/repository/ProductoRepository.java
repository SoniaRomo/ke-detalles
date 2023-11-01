
package com.Apiproyecto.repository;

import com.Apiproyecto.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductoRepository extends CrudRepository<Producto, Integer> {

    @Query("SELECT p FROM producto p WHERE p.activo=true")
    List<Producto> finDallCustom();

}


