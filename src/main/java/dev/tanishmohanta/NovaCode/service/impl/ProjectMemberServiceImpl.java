package dev.tanishmohanta.NovaCode.service.impl;

import dev.tanishmohanta.NovaCode.dto.member.InviteMemberRequest;
import dev.tanishmohanta.NovaCode.dto.member.MemberResponse;
import dev.tanishmohanta.NovaCode.dto.member.UpdateMemberRoleRequest;
import dev.tanishmohanta.NovaCode.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public List<MemberResponse> inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
