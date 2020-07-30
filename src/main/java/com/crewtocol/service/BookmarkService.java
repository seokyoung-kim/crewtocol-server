package com.crewtocol.service;


import com.crewtocol.domain.bookmark.Bookmark;
import com.crewtocol.domain.bookmark.BookmarkRepository;
import com.crewtocol.web.dto.BookmarkListResponseDto;
import com.crewtocol.web.dto.BookmarkSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;

    @Transactional
    public Long save(BookmarkSaveRequestDto requestDto) {
        return bookmarkRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public void delete(Long id) {
        Bookmark bookmark = bookmarkRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 북마크가 없습니다. id = " + id));

        bookmarkRepository.delete(bookmark);
    }

    @Transactional
    public List<BookmarkListResponseDto> findAllDesc() {
        return bookmarkRepository.findAllDesc().stream()        
                .map(BookmarkListResponseDto::new)
                .collect(Collectors.toList());
    }
}