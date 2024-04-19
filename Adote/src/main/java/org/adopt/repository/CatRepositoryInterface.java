package org.adopt.repository;

import org.adopt.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepositoryInterface extends JpaRepository<Cat, Long> {
}
