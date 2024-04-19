package org.adopt.repository;

import org.adopt.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepositoryInterface extends JpaRepository<Dog, Long> {
}
