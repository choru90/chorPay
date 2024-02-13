package com.chorupay.membership.adapter.application.service;

import com.chorupay.membership.adapter.application.port.in.ModifyMembershipCommand;
import com.chorupay.membership.adapter.application.port.in.ModifyMembershipUseCase;
import com.chorupay.membership.adapter.application.port.out.ModifyMembershipPort;
import com.chorupay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.chorupay.membership.adapter.out.persistence.MembershipMapper;
import com.chorupay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.chorupay.common.UserCase;
import org.springframework.transaction.annotation.Transactional;

@UserCase
@RequiredArgsConstructor
@Transactional
public class ModifyMembershipService implements ModifyMembershipUseCase {

    private final ModifyMembershipPort modifyMembershipPort;

    private final MembershipMapper membershipMapper;

    @Override
    public Membership modifyMembership(ModifyMembershipCommand command) {
        MembershipJpaEntity entity = modifyMembershipPort.createMembership(
                new Membership.MembershipId(command.getMembershipId()),
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsValid(command.isValid()),
                new Membership.MembershipIsCorp(command.isCorp())
        );
        return membershipMapper.mapToDomainEntity(entity);
    }
}
