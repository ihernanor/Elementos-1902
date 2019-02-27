/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorUsuario {
    @Autowired RepoUsuario repoU;
    //1.-Guardar :save()
    @PostMapping("/usuario")
    Estatus guardar(@RequestBody String json) throws Exception{
        ObjectMapper maper=new ObjectMapper();
        Usuario u = maper.readValue(json, Usuario.class);
        repoU.save(u);
        Estatus e=new Estatus("Usuario guardado", true);
        return e;
    }
    
    //2. Buscar todos
    @GetMapping("/usuario")
    List<Usuario> buscarTodos(){
      return repoU.findAll();
    }
    
    //3. Buscar por id
    @GetMapping("/usuario/{id}")
    Usuario buscarPorId(@PathVariable Integer id){
        return repoU.findById(id).get();
    }
    
    //4. Actualizar
    @PutMapping("/usuario")
    Estatus actualizar(@RequestBody String json)throws Exception{
        ObjectMapper mapper= new ObjectMapper();
        Usuario u=mapper.readValue(json, Usuario.class);
        repoU.save(u);
        Estatus e=new Estatus("Usuario actualizado", true);
        return e;
    }
    
    //5. Borrar por id
    @DeleteMapping("/usuario/{id}")
    Estatus borrar(@PathVariable Integer id){
        repoU.deleteById(id);
        Estatus e=new Estatus("Usuario borrado con éxito ", true);
        return e;
    }
}
