package com.crewtocol.service;

import com.crewtocol.domain.user.User;
import com.crewtocol.domain.user.UserRepository;
import com.crewtocol.web.dto.UserListResponseDto;
import com.crewtocol.web.dto.UserSaveRequestDto;
import com.crewtocol.web.dto.UserUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public Long save(UserSaveRequestDto requestDto) {
        return userRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, UserUpdateRequestDto requestDto) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다 id = " + id));

        user.update(requestDto.getEmail(), requestDto.getPassword(), requestDto.getOpt());
        return id;
    }

    @Transactional
    public void delete (Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다 id = " + id));

        userRepository.delete(user);
    }

    @Transactional
    public List<UserListResponseDto> findAllDesc(){
        return userRepository.findAllDesc().stream()
                .map(UserListResponseDto::new)
                .collect(Collectors.toList());
    }
   
}