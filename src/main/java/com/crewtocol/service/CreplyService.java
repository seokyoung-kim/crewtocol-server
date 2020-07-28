package com.crewtocol.service;

import com.crewtocol.domain.creply.Creply;
import com.crewtocol.domain.creply.CreplyRepository;
import com.crewtocol.web.dto.CreplyListResponseDto;
import com.crewtocol.web.dto.CreplySaveRequestDto;
import com.crewtocol.web.dto.CreplyUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CreplyService {
    private final CreplyRepository creplyRepository;

    @Transactional
    public Long save(CreplySaveRequestDto requestDto) {
        return creplyRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, CreplyUpdateRequestDto requestDto) {
        Creply creply = creplyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 댓글이 없습니다. id = " + id));

        creply.update(requestDto.getContent());
        return id;
    }

    @Transactional
    public void delete (Long id) {
        Creply creply = creplyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id = " + id));

        creplyRepository.delete(creply);
    }

    @Transactional
    public List<CreplyListResponseDto> findAllDesc() {
        return creplyRepository.findAllDesc().stream()
                .map(CreplyListResponseDto::new)
                .collect(Collectors.toList());
    }
}