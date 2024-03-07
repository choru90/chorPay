package com.chourpay.adapter.in.web;

import com.chourpay.application.port.in.RegisterBankingAccountCommand;
import com.chourpay.application.port.in.RegisterBankingAccountUseCase;
import com.chourpay.domain.RegisteredBankingAccount;
import lombok.RequiredArgsConstructor;
import org.chorupay.common.WebAdapter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterBakingAccountInfoController {

    private final RegisterBankingAccountUseCase registerBankingAccountUseCase;

    @PostMapping("/banking/register/account")
    RegisteredBankingAccount registerBankingAccount(@RequestBody RegisterBankAccountRequest request){
        RegisterBankingAccountCommand command = RegisterBankingAccountCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .isValid(true)
                .isCorp(request.isCorp())
                .build();

        return registerBankingAccountUseCase.registerBankAccount(command);
    }
}
