package io.hongyang.jedi.utility.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lombok.Data;
import org.springframework.validation.FieldError;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {

  RuntimeError error;
  List<Error> errors;

  public ErrorResponse(RuntimeError error) {
    this.error = error;
  }

  public ErrorResponse(List<FieldError> fieldErrors) {
    if (Objects.isNull(errors)) errors = new ArrayList<>();
    for (FieldError fieldError : fieldErrors) {
      String field = fieldError.getField();
      String message = fieldError.getDefaultMessage();
      ValidationError error = new ValidationError(field, message);
      errors.add(error);
    }
  }
}
