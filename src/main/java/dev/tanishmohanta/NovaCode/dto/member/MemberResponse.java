package dev.tanishmohanta.NovaCode.dto.member;

import dev.tanishmohanta.NovaCode.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(Long userId,
                             String email,
                             String name,
                             String avatarUrl,
                             ProjectRole role,
                             Instant invitedAt
                             ) {


}
