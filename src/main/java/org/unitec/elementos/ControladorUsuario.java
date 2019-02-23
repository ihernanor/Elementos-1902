/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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
}
