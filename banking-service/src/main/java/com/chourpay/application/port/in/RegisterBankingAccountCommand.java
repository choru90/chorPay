package com.chourpay.application.port.in;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.chorupay.common.SelfValidating;
import org.springframework.core.io.support.SpringFactoriesLoader;

@Value
@Builder
@EqualsAndHashCode(callSuper = false)
public class RegisterBankingAccountCommand extends SelfValidating<RegisterBankingAccountCommand> {

    private final String name;

    private final String email;

    private final String address;

    private final boolean isValid;

    private final boolean isCorp;

    public RegisterBankingAccountCommand(String name, String email, String address, boolean isValid, boolean isCorps) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.isValid = isValid;
        this.isCorp = isCorps;
    }
}
