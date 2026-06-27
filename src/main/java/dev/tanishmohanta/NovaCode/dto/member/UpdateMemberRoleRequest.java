package dev.tanishmohanta.NovaCode.dto.member;

import dev.tanishmohanta.NovaCode.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}
