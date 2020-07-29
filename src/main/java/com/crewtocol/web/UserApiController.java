package com.crewtocol.web;

import com.crewtocol.service.UserService;
import com.crewtocol.web.dto.UserListResponseDto;
import com.crewtocol.web.dto.UserSaveRequestDto;
import com.crewtocol.web.dto.UserUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserApiController {
    private final UserService userService;

    @PostMapping("/api/v1/user")
    public Long save(@RequestBody UserSaveRequestDto requestDto) {
        return userService.save(requestDto);
    }

    @PutMapping("/api/v1/user/{id}")
    public Long update(@PathVariable Long id, @RequestBody UserUpdateRequestDto requestDto) {
        return userService.update(id, requestDto);
    }

    @DeleteMapping
    public Long delete(@PathVariable Long id) {
        userService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/user/list")
    public List<UserListResponseDto> findAll() {
        return userService.findAllDesc();
    }
}