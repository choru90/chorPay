package com.chorupay.membership.adapter.application.port.out;

import com.chorupay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.chorupay.membership.domain.Membership;

public interface FindMembershipPort {

    MembershipJpaEntity findMembership(Membership.MembershipId membershipId);
}
