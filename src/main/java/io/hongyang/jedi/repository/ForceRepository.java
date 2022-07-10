package io.hongyang.jedi.repository;

import io.hongyang.jedi.entity.Force;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForceRepository extends CrudRepository<Force, String> {}
