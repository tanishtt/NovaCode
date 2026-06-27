package dev.tanishmohanta.NovaCode.service;

import dev.tanishmohanta.NovaCode.dto.member.InviteMemberRequest;
import dev.tanishmohanta.NovaCode.dto.member.MemberResponse;
import dev.tanishmohanta.NovaCode.dto.member.UpdateMemberRoleRequest;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    List<MemberResponse> inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
