package com.chourpay.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;


@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisteredBankingAccount {

    private final String bankingAccountRegisterInfoId;

    private final String name;

    private final String email;

    private final String address;

    private final boolean isValid;

    public static RegisteredBankingAccount generateBakingAccountRegisterInfo(
            BankingAccountRegisterId bankingAccountRegisterId,
            BankingAccountRegisterName name,
            BankingAccountRegisterEmail email,
            BankingAccountRegisterAddress address,
            BankingAccountRegisterIsValid isValid
    ){
        return new RegisteredBankingAccount(
                bankingAccountRegisterId.bankingAccountRegisterInfoId,
                name.bankingAccountRegisterName,
                email.bankingAccountRegisterEmail,
                address.bankingAccountRegisterAddress,
                isValid.bankingAccountRegisterIsValid
        );
    }

    @Value
    public static class BankingAccountRegisterId {
        String bankingAccountRegisterInfoId;

        public BankingAccountRegisterId(String value){
            this.bankingAccountRegisterInfoId = value;
        }
    }

    @Value
    public static class BankingAccountRegisterName{
        String bankingAccountRegisterName;

        public BankingAccountRegisterName(String value){
            this.bankingAccountRegisterName = value;
        }
    }

    @Value
    public static class BankingAccountRegisterEmail{
        String bankingAccountRegisterEmail;

        public BankingAccountRegisterEmail(String value){
            this.bankingAccountRegisterEmail = value;
        }
    }

    @Value
    public static class BankingAccountRegisterAddress{
        String bankingAccountRegisterAddress;

        public BankingAccountRegisterAddress(String value){
            this.bankingAccountRegisterAddress = value;
        }
    }

    @Value
    public static class BankingAccountRegisterIsValid{
        boolean bankingAccountRegisterIsValid ;

        public BankingAccountRegisterIsValid(boolean value){
            this.bankingAccountRegisterIsValid = value;
        }
    }

}
