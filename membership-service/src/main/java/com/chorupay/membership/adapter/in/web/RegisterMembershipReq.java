package com.chorupay.membership.adapter.in.web;

public record RegisterMembershipReq(
        String name,
        String address,
        String email,
        boolean isCorp
) {
}
