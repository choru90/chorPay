package com.chorupay.membership.adapter.in.web;

import com.chorupay.membership.adapter.application.port.in.ModifyMembershipCommand;
import com.chorupay.membership.adapter.application.port.in.ModifyMembershipUseCase;
import com.chorupay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.chorupay.common.WebAdapter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class ModifyMembershipController {

    private final ModifyMembershipUseCase membershipUseCase;

    @PostMapping("/membership/modify/{membershipId}")
    ResponseEntity<Membership> modifyMembershipByMemberId(@RequestBody ModifyMembershipRequest request){
        ModifyMembershipCommand command = ModifyMembershipCommand.builder()
                .membershipId(request.getMembershipId())
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .isValid(request.isValid())
                .isCorp(request.isCorp())
                .build();

        return ResponseEntity.ok(membershipUseCase.modifyMembership(command));
    }

}
