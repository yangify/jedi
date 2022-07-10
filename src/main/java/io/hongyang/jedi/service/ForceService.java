package io.hongyang.jedi.service;

import io.hongyang.jedi.entity.Force;
import io.hongyang.jedi.exception.ForceNotFoundException;
import io.hongyang.jedi.mapper.ForceMapper;
import io.hongyang.jedi.repository.ForceRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ForceService {

  private ForceRepository forceRepository;

  public List<Force> getForces() {
    return (List<Force>) forceRepository.findAll();
  }

  public Force createForce(Force force) {
    return forceRepository.save(force);
  }

  public void deleteForces() {
    forceRepository.deleteAll();
  }

  public Force updateForce(Force source) {
    Optional<Force> nullableForce = forceRepository.findById(source.getId());
    if (nullableForce.isEmpty()) throw new ForceNotFoundException(source);

    Force destination = nullableForce.get();
    ForceMapper.INSTANCE.updateForce(source, destination);

    return forceRepository.save(destination);
  }
}
