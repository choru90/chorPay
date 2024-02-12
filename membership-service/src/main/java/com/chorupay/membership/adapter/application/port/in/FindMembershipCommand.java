package com.chorupay.membership.adapter.application.port.in;

import common.SelfValidating;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class FindMembershipCommand extends SelfValidating<FindMembershipCommand> {

    private final String membershipId;
}
