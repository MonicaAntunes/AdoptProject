package org.adopt.service.catService;

import org.adopt.dto.catDto.CatRequest;
import org.adopt.exceptions.AnimalNotFoundException;
import org.adopt.model.Cat;
import org.adopt.repository.CatRepositoryInterface;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CatService {
    private final CatRepositoryInterface catRepositoryInterface;

    public CatService(CatRepositoryInterface catRepositoryInterface) {
        this.catRepositoryInterface = catRepositoryInterface;
    }

    public Cat create(CatRequest catRequest) {
        //se o gato que for ser cadastrado
        //for igual a um gato já existente
        //emite mensagem para usuario
//        Cat cat = findById();
//        if () {
//
//        }
//        return gatoRepositoryInterface.save(gato);
    }

    private void checkingDuplicateData(Cat cat) throws AnimalNotFoundException {
        List<Cat> cats = findAll();
        for (Cat cat1 : cats) {
            if (cat.equals(cat1)) {
                throw new AnimalNotFoundException();
            }
        }
    }

    public Cat update(Long id, CatRequest catRequest) throws AnimalNotFoundException {
        Cat cat = findById(id);
        //lógica p/ atualizar
        return catRepositoryInterface.save(cat);
    }

    public Cat patch() {
        return null;
    }

    public void delete() {

    }

    public Cat findById(Long id) throws AnimalNotFoundException {
        return catRepositoryInterface.findById(id)
                .orElseThrow(AnimalNotFoundException::new);
    }

    public List<Cat> findAll() {
        return catRepositoryInterface.findAll();
    }
}
