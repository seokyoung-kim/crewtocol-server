package com.crewtocol.web;

import com.crewtocol.service.CreplyService;
import com.crewtocol.web.dto.CreplyListResponseDto;
import com.crewtocol.web.dto.CreplySaveRequestDto;
import com.crewtocol.web.dto.CreplyUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CreplyApiController {
    private final CreplyService creplyService;

    @PostMapping("/api/v1/creply")
    public Long save(@RequestBody CreplySaveRequestDto requestDto) {
        return creplyService.save(requestDto);
    }

    @PutMapping("/api/v1/creply/{id}")
    public Long update(@PathVariable Long id, @RequestBody CreplyUpdateRequestDto requestDto) {
        return creplyService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/creply/{id}")
    public Long delete(@PathVariable Long id) {
        creplyService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/creply/list")
    public List<CreplyListResponseDto> findAll() {
        return creplyService.findAllDesc();
    }
}