package io.hongyang.jedi.exception;

import io.hongyang.jedi.entity.Force;

public class ForceNotFoundException extends RuntimeException {

  public ForceNotFoundException(Force force) {
    this(force.getId());
  }

  public ForceNotFoundException(String id) {
    super("Force with id: " + id + " does not exist");
  }
}
