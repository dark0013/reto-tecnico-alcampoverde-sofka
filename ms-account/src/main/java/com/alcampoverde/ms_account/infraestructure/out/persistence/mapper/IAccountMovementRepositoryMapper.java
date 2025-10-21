package com.alcampoverde.ms_account.infraestructure.out.persistence.mapper;

import com.alcampoverde.ms_account.domain.model.Movement;
import com.alcampoverde.ms_account.infraestructure.out.persistence.entity.MovementEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IAccountMovementRepositoryMapper {

    Movement toDomain(MovementEntity account);

    MovementEntity toEntity(Movement account);
}


