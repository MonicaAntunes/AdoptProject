package org.adopt.service.dogService;

import org.adopt.dto.dogDto.DogResponse;
import org.adopt.exceptions.AnimalNotFoundException;
import org.adopt.model.Dog;
import org.adopt.repository.DogRepositoryInterface;
import java.util.List;

public class DogService {
    private final DogRepositoryInterface dogRepositoryInterface;

    public DogService(DogRepositoryInterface dogRepositoryInterface) {
        this.dogRepositoryInterface = dogRepositoryInterface;
    }

    public Dog create(Dog dog) {
        return dogRepositoryInterface.save(dog);
    }

    private void checkingDuplicateData(Dog dog) throws AnimalNotFoundException {
        List<Dog> dogs = findAll();
        for (Dog dog1 : dogs) {
            if (dog.equals(dog1)) {
                throw new AnimalNotFoundException();
            }
        }
    }

    public Dog update(Long id, DogResponse dogResponse) throws AnimalNotFoundException {
        Dog dog = findById(id);
        //lógica p/ atualizar
        return dogRepositoryInterface.save(dog);
    }

    public Dog patch() {
        return null;
    }

    public void delete() {

    }

    public Dog findById(Long id) throws AnimalNotFoundException {
        return dogRepositoryInterface.findById(id)
                .orElseThrow(AnimalNotFoundException::new);
    }

    public List<Dog> findAll() {
        return dogRepositoryInterface.findAll();
    }
}
