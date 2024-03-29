package com.chorupay.membership.adapter.in.web;

import com.chorupay.membership.adapter.application.port.in.FindMembershipCommand;
import com.chorupay.membership.adapter.application.port.in.FindMembershipUseCase;
import com.chorupay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.chorupay.common.WebAdapter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class FindMembershipController {

    private final FindMembershipUseCase findMembershipUseCase;

    @GetMapping("/membership/{membershipId}")
    ResponseEntity<Membership> findMembershipByMemberId(@PathVariable("membershipId") String membershipId){
        FindMembershipCommand command = FindMembershipCommand.builder()
                .membershipId(membershipId)
                .build();
        return ResponseEntity.ok(findMembershipUseCase.findMembership(command));
    }

}
