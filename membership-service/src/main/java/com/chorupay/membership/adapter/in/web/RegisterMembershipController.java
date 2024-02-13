package com.chorupay.membership.adapter.in.web;

import com.chorupay.membership.adapter.application.port.in.RegisterMembershipCommand;
import com.chorupay.membership.adapter.application.port.in.RegisterMembershipUseCase;
import com.chorupay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.chorupay.common.WebAdapter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMembershipController {

    private final RegisterMembershipUseCase registerMembershipUseCase;

    @PostMapping("/membership/register")
    Membership registerMembership(@RequestBody RegisterMembershipReq req){
        // request-> command
        RegisterMembershipCommand command =RegisterMembershipCommand.builder()
                .name(req.name())
                .address(req.address())
                .email(req.email())
                .isValid(true)
                .isCorp(req.isCorp())
                .build();

        return registerMembershipUseCase.registerMembership(command);
    }
}
