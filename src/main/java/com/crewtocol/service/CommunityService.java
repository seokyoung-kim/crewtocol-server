package com.crewtocol.service;

import com.crewtocol.domain.community.Community;
import com.crewtocol.domain.community.CommunityRepository;
import com.crewtocol.web.dto.CommunityListResponseDto;
import com.crewtocol.web.dto.CommunityResponseDto;
import com.crewtocol.web.dto.CommunitySaveRequestDto;
import com.crewtocol.web.dto.CommunityUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CommunityService {
    private final CommunityRepository communityRepository;

    @Transactional
    public Long save(CommunitySaveRequestDto requestDto) {
        return communityRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, CommunityUpdateRequestDto requestDto) {
        Community community = communityRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        community.update(requestDto.getTitle(), requestDto.getContent(), requestDto.getHeadCount());
        return id;
    }

    @Transactional
    public void delete (Long id) {
        Community community = communityRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id = " + id));

        communityRepository.delete(community);
    }

    @Transactional
    public CommunityResponseDto findById(Long id) {
        Community entity = communityRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id = " + id));
        
        return new CommunityResponseDto(entity);
    }

    @Transactional
    public List<CommunityListResponseDto> findAllDesc() {
        return communityRepository.findAllDesc().stream()
                .map(CommunityListResponseDto::new)
                .collect(Collectors.toList());
    }
}