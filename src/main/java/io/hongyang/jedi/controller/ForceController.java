package io.hongyang.jedi.controller;

import io.hongyang.jedi.entity.Force;
import io.hongyang.jedi.service.ForceService;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forces")
@AllArgsConstructor
public class ForceController {

  private ForceService forceService;

  @GetMapping("/{id}")
  Force getForce(@PathVariable String id) {
    return forceService.getForce(id);
  }

  @GetMapping
  List<Force> getForces() {
    return forceService.getForces();
  }

  @PostMapping
  Force updateForce(@Valid @RequestBody Force force) {
    return forceService.updateForce(force);
  }

  @PutMapping
  Force createForce(@Valid @RequestBody Force force) {
    return forceService.createForce(force);
  }

  @DeleteMapping("/{id}")
  void deleteForce(@PathVariable String id) {
    forceService.deleteForce(id);
  }

  @DeleteMapping
  void deleteForces() {
    forceService.deleteForces();
  }
}
