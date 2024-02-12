package com.chorupay.membership.adapter.application.service;

import com.chorupay.membership.adapter.application.port.in.FindMembershipCommand;
import com.chorupay.membership.adapter.application.port.in.FindMembershipUseCase;
import com.chorupay.membership.adapter.application.port.out.FindMembershipPort;
import com.chorupay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.chorupay.membership.adapter.out.persistence.MembershipMapper;
import com.chorupay.membership.domain.Membership;
import common.UserCase;
import lombok.RequiredArgsConstructor;

@UserCase
@RequiredArgsConstructor
public class FindMembershipService implements FindMembershipUseCase {

    private final FindMembershipPort findMembershipPort;

    private final MembershipMapper membershipMapper;

    @Override
    public Membership findMembership(FindMembershipCommand command) {
        MembershipJpaEntity entity = findMembershipPort.findMembership(new Membership.MembershipId(command.getMembershipId()));
        return membershipMapper.mapToDomainEntity(entity);
    }
}
