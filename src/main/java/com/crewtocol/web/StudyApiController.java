package com.crewtocol.web;

import com.crewtocol.service.StudyService;
import com.crewtocol.web.dto.StudyListResponseDto;
import com.crewtocol.web.dto.StudyResponseDto;
import com.crewtocol.web.dto.StudySaveRequestDto;
import com.crewtocol.web.dto.StudyUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StudyApiController {
    private final StudyService studyService;

    @PostMapping("/api/v1/study")
    public Long save(@RequestBody StudySaveRequestDto requestDto) {
        return studyService.save(requestDto);
    }

    @PutMapping("/api/v1/study/{id}")
    public Long update(@PathVariable Long id, @RequestBody StudyUpdateRequestDto requestDto) {
        return studyService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/study/{id}")
    public Long delete(@PathVariable Long id) {
        studyService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/study/{id}")
    public StudyResponseDto findById(@PathVariable Long id) {
        return studyService.findById(id);
    }

    @GetMapping("/api/v1/study/list")
    public List<StudyListResponseDto> findAll() {
        return studyService.findAllDesc();
    }
}
