package io.hongyang.jedi.force;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForceRepository extends CrudRepository<Force, String> {}
