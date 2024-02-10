package com.chorupay.membership.adapter.application.service;

import com.chorupay.membership.adapter.application.port.in.RegisterMembershipCommand;
import com.chorupay.membership.adapter.application.port.in.RegisterMembershipUseCase;
import com.chorupay.membership.adapter.application.port.out.RegisterMembershipPort;
import com.chorupay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.chorupay.membership.adapter.out.persistence.MembershipMapper;
import com.chorupay.membership.domain.Membership;
import common.UserCase;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@UserCase
@RequiredArgsConstructor
@Transactional
public class RegisterMembershipService implements RegisterMembershipUseCase {

    private final RegisterMembershipPort registerMembershipPort;
    private final MembershipMapper membershipMapper;

    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {
        // command -> DB

        MembershipJpaEntity entity =registerMembershipPort.createMembership(
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsValid(command.isValid()),
                new Membership.MembershipIsCorp(command.isCorp())
        );

        return membershipMapper.mapToDomainEntity(entity);
    }
}
