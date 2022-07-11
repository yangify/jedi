package io.hongyang.jedi.utility.error;

import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RuntimeError implements Error {
  @NotBlank final String message;
}
