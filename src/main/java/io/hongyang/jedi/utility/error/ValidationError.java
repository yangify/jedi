package io.hongyang.jedi.utility.error;

import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ValidationError implements Error {
  @NotBlank final String field;
  @NotBlank final String message;
}
