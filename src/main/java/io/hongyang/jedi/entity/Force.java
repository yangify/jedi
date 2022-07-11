package io.hongyang.jedi.entity;

import java.io.Serializable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Force")
@Data
public class Force implements Serializable {

  @Id @Generated private String id;

  @NotBlank private String name;

  @NotNull
  @Min(18)
  private Integer age;
}
