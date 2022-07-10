package io.hongyang.jedi.mapper;

import io.hongyang.jedi.entity.Force;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ForceMapper {

  ForceMapper INSTANCE = Mappers.getMapper(ForceMapper.class);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  void updateForce(Force source, @MappingTarget Force destination);
}
