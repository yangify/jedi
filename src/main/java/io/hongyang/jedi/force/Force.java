package io.hongyang.jedi.force;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Force")
@Data
public class Force implements Serializable {

  @Id @Generated private String id;
  @NotBlank private String name;
}
