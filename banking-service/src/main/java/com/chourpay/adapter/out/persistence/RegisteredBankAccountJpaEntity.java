package com.chourpay.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "registered_bank_account")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegisteredBankAccountJpaEntity {

    @Id
    @GeneratedValue
    private Long membershipId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private boolean isValid;

    @Column
    private boolean isCorp;

}
