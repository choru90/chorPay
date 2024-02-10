package com.chorupay.membership.adapter.application.port.out;

import com.chorupay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.chorupay.membership.domain.Membership;

public interface RegisterMembershipPort {

    MembershipJpaEntity createMembership(
            Membership.MembershipName membershipName,
            Membership.MembershipEmail membershipEmail,
            Membership.MembershipAddress membershipAddress,
            Membership.MembershipIsValid membershipIsValid,
            Membership.MembershipIsCorp membershipIsCorp
    );
}
