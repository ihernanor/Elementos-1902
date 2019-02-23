package org.unitec.elementos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner {
    
    @Autowired
    RepoUsuario repoU;

	public static void main(String[] args) {
		SpringApplication.run(ElementosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        //Aquí irán todas nuestras pruebitas! Sin necesidad de UI.
          //repoU.save(new Usuario(4, "Dakota"));
          /*
          for(Usuario u:repoU.findAll()){
              System.out.println(u);
          }
          */
          //System.out.println(repoU.findById(3).get());
          //repoU.save(new Usuario(1,"Iván Hernández"));
          //System.out.println(repoU.findById(1).get());
          //repoU.deleteById(1);
          /*
          for(Usuario u:repoU.findByNombre("Dakota")){
              System.out.println(u);
          }
          */
    }
}

