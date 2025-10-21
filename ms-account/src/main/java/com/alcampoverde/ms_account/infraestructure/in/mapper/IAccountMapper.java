package com.alcampoverde.ms_account.infraestructure.in.mapper;

import com.alcampoverde.ms_account.domain.model.Account;
import com.alcampoverde.ms_account.infraestructure.in.dto.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IAccountMapper {

    @Mapping(target = "movements", ignore = true)
    Account toDomain(AccountDto account);

    AccountDto toDto(Account account);

}

