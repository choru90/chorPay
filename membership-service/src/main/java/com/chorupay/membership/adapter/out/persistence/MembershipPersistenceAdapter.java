package com.chorupay.membership.adapter.out.persistence;

import com.chorupay.membership.adapter.application.port.out.FindMembershipPort;
import com.chorupay.membership.adapter.application.port.out.ModifyMembershipPort;
import com.chorupay.membership.adapter.application.port.out.RegisterMembershipPort;
import com.chorupay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.chorupay.common.PersistenceAdapter;

@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort, FindMembershipPort, ModifyMembershipPort {

    private final SpringDataMembershipRepository membershipRepository;

    @Override
    public MembershipJpaEntity createMembership(Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp) {
        return membershipRepository.save(new MembershipJpaEntity(
                membershipName.getMembershipNameValue(),
                membershipAddress.getMembershipAddressValue(),
                membershipEmail.getMembershipEmailValue(),
                membershipIsValid.isMembershipIsValidValue(),
                membershipIsCorp.isMembershipIsCorpValue()
        ));
    }

    @Override
    public MembershipJpaEntity findMembership(Membership.MembershipId membershipId) {
        return membershipRepository.findById(Long.parseLong(membershipId.getMembershipIdValue())).orElseThrow(() -> new RuntimeException());
    }

    @Override
    public MembershipJpaEntity createMembership(Membership.MembershipId membershipId, Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp) {
        MembershipJpaEntity entity = membershipRepository.findById(Long.parseLong(membershipId.getMembershipIdValue())).orElseThrow(() -> new RuntimeException("membership id가 올바르지 않습니다."));
        entity.update(membershipName.getMembershipNameValue() , membershipAddress.getMembershipAddressValue(), membershipEmail.getMembershipEmailValue(), membershipIsValid.isMembershipIsValidValue(), membershipIsCorp.isMembershipIsCorpValue());
        return membershipRepository.save(entity);
    }
}
