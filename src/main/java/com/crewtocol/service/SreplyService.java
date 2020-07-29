package com.crewtocol.service;

import com.crewtocol.domain.sreply.Sreply;
import com.crewtocol.domain.sreply.SreplyRepository;
import com.crewtocol.web.dto.SreplyListResponseDto;
import com.crewtocol.web.dto.SreplySaveRequestDto;
import com.crewtocol.web.dto.SreplyUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SreplyService {
    private final SreplyRepository sreplyRepository;

    @Transactional
    public Long save(SreplySaveRequestDto requestDto) {
        return sreplyRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, SreplyUpdateRequestDto requestDto) {
        Sreply sreply = sreplyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 댓글이 없습니다. id = " + id));

        sreply.update(requestDto.getContent());
        return id;
    }

    @Transactional
    public void delete (Long id) {
        Sreply sreply = sreplyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id = " + id));

        sreplyRepository.delete(sreply);
    }

    @Transactional
    public List<SreplyListResponseDto> findAllDesc() {
        return sreplyRepository.findAllDesc().stream()
                .map(SreplyListResponseDto::new)
                .collect(Collectors.toList());
    }
}