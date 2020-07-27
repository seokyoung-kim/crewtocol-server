package com.crewtocol.service;

import com.crewtocol.domain.study.Study;
import com.crewtocol.domain.study.StudyRepository;
import com.crewtocol.web.dto.StudyListResponseDto;
import com.crewtocol.web.dto.StudyResponseDto;
import com.crewtocol.web.dto.StudySaveRequestDto;
import com.crewtocol.web.dto.StudyUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StudyService {
    private final StudyRepository studyRepository;

    @Transactional
    public Long save(StudySaveRequestDto requestDto) {
        return studyRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, StudyUpdateRequestDto requestDto) {
        Study study = studyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        study.update(requestDto.getTitle(), requestDto.getContent(), requestDto.getLanguage(), requestDto.getLocation(), requestDto.getHeadCount());
        return id;
    }

    @Transactional
    public void delete (Long id) {
        Study study = studyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id = " + id));

        studyRepository.delete(study);
    }

    @Transactional
    public StudyResponseDto findById(Long id) {
        Study entity = studyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id = " + id));

        return new StudyResponseDto(entity);
    }

    @Transactional
    public List<StudyListResponseDto> findAllDesc() {
        return studyRepository.findAllDesc().stream()
                .map(StudyListResponseDto::new)
                .collect(Collectors.toList());
    }

}
