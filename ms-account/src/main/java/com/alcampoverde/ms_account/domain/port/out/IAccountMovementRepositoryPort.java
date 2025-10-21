package com.alcampoverde.ms_account.domain.port.out;

import com.alcampoverde.ms_account.domain.model.Movement;

import java.util.List;
import java.util.Optional;

public interface IAccountMovementRepositoryPort {
    Optional<Movement> findById(Integer id);

    List<Movement> findAll();

    Movement transaction(Movement transaction);
    void cancelTransaction(Integer movementId);
}
