package com.chorupay.membership.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {

    private final String membershipId;
    private final String name;
    private final String email;
    private final String address;
    private final boolean isValid;
    private final boolean isCorp;

    public static Membership generateMember(MembershipId membershipId,
                                            MembershipName membershipName,
                                            MembershipEmail membershipEmail,
                                            MembershipAddress membershipAddress,
                                            MembershipIsValid membershipIsValid,
                                            MembershipIsCorp membershipIsCorp){
        return new Membership(
                membershipId.membershipIdValue,
                membershipName.membershipNameValue,
                membershipEmail.membershipEmailValue,
                membershipAddress.membershipAddressValue,
                membershipIsValid.MembershipIsValidValue,
                membershipIsCorp.MembershipIsCorpValue
        );
    }


    @Value
    public static class MembershipId{

        public MembershipId(String value){
            this.membershipIdValue = value;
        }

        String membershipIdValue;
    }

    @Value
    public static class MembershipName{

        public MembershipName(String value){
            this.membershipNameValue = value;
        }

        String membershipNameValue;
    }

    @Value
    public static class MembershipEmail{

        public MembershipEmail(String value){
            this.membershipEmailValue = value;
        }

        String membershipEmailValue;
    }

    @Value
    public static class MembershipAddress{

        public MembershipAddress(String value){
            this.membershipAddressValue = value;
        }

        String membershipAddressValue;
    }

    @Value
    public static class MembershipIsValid{

        public MembershipIsValid(boolean value){
            this.MembershipIsValidValue = value;
        }

        boolean MembershipIsValidValue;
    }

    @Value
    public static class MembershipIsCorp{

        public MembershipIsCorp(boolean value){
            this.MembershipIsCorpValue = value;
        }

        boolean MembershipIsCorpValue;
    }

}
