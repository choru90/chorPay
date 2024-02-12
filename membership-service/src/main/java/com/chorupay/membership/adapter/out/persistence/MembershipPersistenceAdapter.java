package com.chorupay.membership.adapter.out.persistence;

import com.chorupay.membership.adapter.application.port.out.FindMembershipPort;
import com.chorupay.membership.adapter.application.port.out.RegisterMembershipPort;
import com.chorupay.membership.domain.Membership;
import common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort, FindMembershipPort {

    private final SpringDataMembershipRepository membershipRepository;

    @Override
    public MembershipJpaEntity createMembership(Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp) {
        return membershipRepository.save(new MembershipJpaEntity(
                membershipName.getMembershipNameValue(),
                membershipEmail.getMembershipEmailValue(),
                membershipAddress.getMembershipAddressValue(),
                membershipIsValid.isMembershipIsValidValue(),
                membershipIsCorp.isMembershipIsCorpValue()
        ));
    }

    @Override
    public MembershipJpaEntity findMembership(Membership.MembershipId membershipId) {
        return membershipRepository.findById(Long.parseLong(membershipId.getMembershipIdValue())).orElseThrow(() -> new RuntimeException());
    }
}
