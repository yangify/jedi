package io.hongyang.jedi.force;

import java.io.Serializable;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Force")
@Data
public class Force implements Serializable {

  @Id @Generated String id;
  String name;
}
