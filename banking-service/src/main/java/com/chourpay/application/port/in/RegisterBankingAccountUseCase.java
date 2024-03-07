package com.chourpay.application.port.in;

import com.chourpay.domain.RegisteredBankingAccount;

public interface RegisterBankingAccountUseCase {

    RegisteredBankingAccount registerBankAccount(RegisterBankingAccountCommand command);
}
