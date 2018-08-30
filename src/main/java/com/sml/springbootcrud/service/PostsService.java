package com.sml.springbootcrud.service;

import com.sml.springbootcrud.domain.posts.PostsRepository;
import com.sml.springbootcrud.domain.posts.dto.posts.PostsDeleteRequestDTO;
import com.sml.springbootcrud.domain.posts.dto.posts.PostsMainResponseDTO;
import com.sml.springbootcrud.domain.posts.dto.posts.PostsSaveRequestDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDTO dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDTO> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDTO::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void delete(PostsDeleteRequestDTO dto){
        postsRepository.deleteByTitle(dto.getTitle());
    }
}
