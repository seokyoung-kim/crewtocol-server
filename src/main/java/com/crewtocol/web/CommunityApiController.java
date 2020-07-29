package com.crewtocol.web;

import com.crewtocol.service.CommunityService;
import com.crewtocol.web.dto.CommunityListResponseDto;
import com.crewtocol.web.dto.CommunityResponseDto;
import com.crewtocol.web.dto.CommunitySaveRequestDto;
import com.crewtocol.web.dto.CommunityUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommunityApiController {
    private final CommunityService communityService;

    @PostMapping("/api/v1/community")
    public Long save(@RequestBody CommunitySaveRequestDto requestDto) {
        return communityService.save(requestDto);
    }

    @PutMapping("/api/v1/community/{id}")
    public Long update(@PathVariable Long id, @RequestBody CommunityUpdateRequestDto requestDto) {
        return communityService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/community/{id}")
    public Long delete(@PathVariable Long id) {
        communityService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/community/{id}")
    public CommunityResponseDto findById(@PathVariable Long id) {
        return communityService.findById(id);
    }

    @GetMapping("/api/v1/community/list")
    public List<CommunityListResponseDto> findAll() {
        return communityService.findAllDesc();
    }


}