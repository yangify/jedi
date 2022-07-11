package io.hongyang.jedi.service;

import io.hongyang.jedi.entity.Force;
import io.hongyang.jedi.exception.ForceNotFoundException;
import io.hongyang.jedi.repository.ForceRepository;
import io.hongyang.jedi.utility.mapper.ForceMapper;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ForceService {

  private ForceRepository forceRepository;

  public Force getForce(String id) {
    Optional<Force> retrievedForce = forceRepository.findById(id);
    if (retrievedForce.isEmpty()) throw new ForceNotFoundException(id);
    return retrievedForce.get();
  }

  public List<Force> getForces() {
    return (List<Force>) forceRepository.findAll();
  }

  public Force createForce(Force force) {
    return forceRepository.save(force);
  }

  public Force updateForce(Force source) {
    Optional<Force> retrievedForce = forceRepository.findById(source.getId());
    if (retrievedForce.isEmpty()) throw new ForceNotFoundException(source);

    Force destination = retrievedForce.get();
    ForceMapper.INSTANCE.updateForce(source, destination);
    return forceRepository.save(destination);
  }

  public void deleteForce(String id) {
    forceRepository.deleteById(id);
  }

  public void deleteForces() {
    forceRepository.deleteAll();
  }
}
