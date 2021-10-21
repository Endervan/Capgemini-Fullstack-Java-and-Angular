package one.digitalinovation.personapi.controllers;


import one.digitalinovation.personapi.dto.MessageResponseDTO;
import one.digitalinovation.personapi.dto.request.PersonDTO;
import one.digitalinovation.personapi.exception.PersonNotFoundException;
import one.digitalinovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // instruir para retorna status code 201 por defaul java gera code 200
    public MessageResponseDTO create(@RequestBody @Valid PersonDTO personDTO) {
        return personService.create(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }

    // retorna detalhe de cada item da lista
    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
        return personService.update(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  deleteById(Long id) throws PersonNotFoundException {
        personService.delete(id);
    }

}
