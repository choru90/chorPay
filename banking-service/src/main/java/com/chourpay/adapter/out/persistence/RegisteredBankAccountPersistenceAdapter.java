package com.chourpay.adapter.out.persistence;

import com.chourpay.application.port.out.RegisterBankingAccountPort;
import com.chourpay.domain.RegisteredBankingAccount;
import lombok.RequiredArgsConstructor;
import org.chorupay.common.PersistenceAdapter;

import javax.swing.*;

@PersistenceAdapter
@RequiredArgsConstructor
public class RegisteredBankAccountPersistenceAdapter implements RegisterBankingAccountPort {
    private final SpringDataRegisteredBankAccountRepository registeredBankAccountRepository;

    @Override
    public RegisteredBankAccountJpaEntity createRegisteredBankAccount() {
        return registeredBankAccountRepository.save(new RegisteredBankAccountJpaEntity());
    }
}
