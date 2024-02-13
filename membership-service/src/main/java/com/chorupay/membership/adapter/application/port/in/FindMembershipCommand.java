package com.chorupay.membership.adapter.application.port.in;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.chorupay.common.SelfValidating;

@Getter
@Builder
@EqualsAndHashCode
public class FindMembershipCommand extends SelfValidating<FindMembershipCommand> {

    private final String membershipId;
}
