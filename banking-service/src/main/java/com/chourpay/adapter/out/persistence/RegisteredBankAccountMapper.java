package com.chourpay.adapter.out.persistence;

import com.chourpay.domain.RegisteredBankingAccount;
import org.springframework.stereotype.Component;

@Component
public class RegisteredBankAccountMapper {

    public RegisteredBankingAccount mapToDomainEntity(RegisteredBankAccountJpaEntity entity){
        return RegisteredBankingAccount.generateBakingAccountRegisterInfo(
                new RegisteredBankingAccount.BankingAccountRegisterId(entity.getMembershipId()+"")
        );
    }
}
