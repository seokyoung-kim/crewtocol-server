package com.crewtocol.web;

import com.crewtocol.service.SreplyService;
import com.crewtocol.web.dto.SreplyListResponseDto;
import com.crewtocol.web.dto.SreplySaveRequestDto;
import com.crewtocol.web.dto.SreplyUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SreplyApiController {
    private final SreplyService sreplyService;

    @PostMapping("/api/v1/sreply")
    public Long save(@RequestBody SreplySaveRequestDto requestDto) {
        return sreplyService.save(requestDto);
    }

    @PutMapping("/api/v1/sreply/{id}")
    public Long update(@PathVariable Long id, @RequestBody SreplyUpdateRequestDto requestDto) {
        return sreplyService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/sreply/{id}")
    public Long delete(@PathVariable Long id) {
        sreplyService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/sreply/list")
    public List<SreplyListResponseDto> findAll() {
        return sreplyService.findAllDesc();
    }
}