package com.chourpay.application.service;

import com.chourpay.adapter.out.persistence.RegisteredBankAccountMapper;
import com.chourpay.application.port.in.RegisterBankingAccountCommand;
import com.chourpay.application.port.in.RegisterBankingAccountUseCase;
import com.chourpay.application.port.out.RegisterBankingAccountPort;
import com.chourpay.domain.RegisteredBankingAccount;
import lombok.RequiredArgsConstructor;
import org.chorupay.common.UserCase;
import org.springframework.transaction.annotation.Transactional;

@UserCase
@RequiredArgsConstructor
@Transactional
public class RegisterBankAccountService implements RegisterBankingAccountUseCase {

    private final RegisterBankingAccountPort port;

    private final RegisteredBankAccountMapper mapper;



    @Override
    public RegisteredBankingAccount registerBankAccount(RegisterBankingAccountCommand command) {

//        port.createRegisteredBankAccount(new RegisteredBankingAccount.BankingAccountRegisterInfoId(command.getEmail()));
    }
}
