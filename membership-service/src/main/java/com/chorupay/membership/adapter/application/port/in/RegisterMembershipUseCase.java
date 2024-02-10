package com.chorupay.membership.adapter.application.port.in;

import com.chorupay.membership.domain.Membership;
import common.UserCase;

public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);
}
