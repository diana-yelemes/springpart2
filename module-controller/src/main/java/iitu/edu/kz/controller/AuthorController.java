package iitu.edu.kz.controller;

import iitu.edu.kz.entity.Author;
import iitu.edu.kz.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/authors")
@AllArgsConstructor

public class AuthorController {

    private final AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<Author>> readAll() {
        return new ResponseEntity<>(authorService.readAll(), HttpStatus.OK);
    }



}
