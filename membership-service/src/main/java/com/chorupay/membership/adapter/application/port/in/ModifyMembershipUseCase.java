package com.chorupay.membership.adapter.application.port.in;

import com.chorupay.membership.domain.Membership;

public interface ModifyMembershipUseCase {

    Membership modifyMembership(ModifyMembershipCommand command);

}
