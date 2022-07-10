package io.hongyang.jedi.exception;

import io.hongyang.jedi.entity.Force;

public class ForceNotFoundException extends RuntimeException {
  public ForceNotFoundException(Force force) {
    super("Force with id: " + force.getId() + " does not exist");
  }
}
