package com.crewtocol.web;

import com.crewtocol.service.BookmarkService;
import com.crewtocol.web.dto.BookmarkListResponseDto;
import com.crewtocol.web.dto.BookmarkSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookmarkApiController {
    private final BookmarkService bookmarkService;
    
    @PostMapping("/api/v1/bookmark")
    public Long save(@RequestBody BookmarkSaveRequestDto requestDto) {
        return bookmarkService.save(requestDto);
    }

    @DeleteMapping("/api/v1/bookmark/{id}")
    public Long delete(@PathVariable Long id) {
        bookmarkService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/bookmark/{id}")
    public List<BookmarkListResponseDto> findAll() {
        return bookmarkService.findAllDesc();
    }
}