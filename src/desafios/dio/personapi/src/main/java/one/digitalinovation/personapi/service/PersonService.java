package one.digitalinovation.personapi.service;


import one.digitalinovation.personapi.dto.MessageResponseDTO;
import one.digitalinovation.personapi.dto.mapper.response.PersonMapper;
import one.digitalinovation.personapi.dto.request.PersonDTO;
import one.digitalinovation.personapi.entities.Person;
import one.digitalinovation.personapi.exception.PersonNotFoundException;
import one.digitalinovation.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service // gerencia a classe tipo servico para toda regra de negocio da aplicação
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;


    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // create person
    public MessageResponseDTO create(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Create person with id" + savedPerson.getId())
                .build();
    }


    // retorna todas da lista
    public List<PersonDTO> listAll() {
        List<Person> allPerson = personRepository.findAll();
        return allPerson.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }


    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        Person person = verifyIfExists(id);
        return personMapper.toDTO(person);
    }


    public void delete(@PathVariable Long id) throws PersonNotFoundException {
        verifyIfExists(id);
        personRepository.deleteById(id);
    }

    private Person verifyIfExists(Long id) throws PersonNotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    public MessageResponseDTO update(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        verifyIfExists(id);

        Person updatedPerson = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(updatedPerson);

        MessageResponseDTO messageResponse = createMessageResponse("Person successfully updated with ID ", savedPerson.getId());

        return messageResponse;
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
