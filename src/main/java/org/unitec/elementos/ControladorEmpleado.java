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

@RestController
@RequestMapping("/api")
@CrossOrigin

public class ControladorEmpleado {


    @Autowired RepoEmpleado repoE;

    //1.-Guardar :save()
    @PostMapping("/empleado")
    Estatus guardar(@RequestBody String json) throws Exception{
        ObjectMapper maper=new ObjectMapper();
        Empleado e = maper.readValue(json, Empleado.class);
        repoE.save(e);
        Estatus es=new Estatus("Empleado guardado", true);
        return es;
    }  
}
    

