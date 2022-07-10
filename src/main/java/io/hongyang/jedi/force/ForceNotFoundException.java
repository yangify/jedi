package io.hongyang.jedi.force;

public class ForceNotFoundException extends RuntimeException {
  public ForceNotFoundException(Force force) {
    super("Force with id: " + force.getId() + " does not exist");
  }
}
