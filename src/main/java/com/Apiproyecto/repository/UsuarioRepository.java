
package com.Apiproyecto.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.Apiproyecto.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select u from usuario u where u.activo= true")
    List<Usuario> finDallCustom();

}

