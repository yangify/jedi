package io.hongyang.jedi.force;

import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forces")
@AllArgsConstructor
public class ForceController {

  private ForceService forceService;

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

  @DeleteMapping
  void deleteForces() {
    forceService.deleteForces();
  }
}
