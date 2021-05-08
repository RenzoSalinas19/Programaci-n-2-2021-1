package edu.usmp.sunat.web;

import java.util.List;
import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.usmp.sunat.domain.Usuario;
import edu.usmp.sunat.repository.UsuarioRepository;

@RestController
public class UsuarioController {

    private UsuarioRepository UsuarioRepository;

    public UsuarioController(UsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }


    @GetMapping(value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Usuario>> usuarios() {
        return new ResponseEntity<List<Usuario>>(
            UsuarioRepository.findAll(),HttpStatus.OK);
    }

   
    
}
