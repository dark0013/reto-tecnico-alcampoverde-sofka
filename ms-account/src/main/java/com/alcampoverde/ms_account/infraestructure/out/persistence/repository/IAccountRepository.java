package com.alcampoverde.ms_account.infraestructure.out.persistence.repository;

import com.alcampoverde.ms_account.infraestructure.out.persistence.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAccountRepository extends JpaRepository<AccountEntity, Integer> {

    Optional<AccountEntity> findByAccountNumber(String accountNumber);

}
