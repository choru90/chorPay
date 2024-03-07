package com.chourpay.application.port.out;

import com.chourpay.adapter.out.persistence.RegisteredBankAccountJpaEntity;
import com.chourpay.domain.RegisteredBankingAccount;

public interface RegisterBankingAccountPort {

    RegisteredBankAccountJpaEntity createRegisteredBankAccount(
            RegisteredBankingAccount.
    );
}
