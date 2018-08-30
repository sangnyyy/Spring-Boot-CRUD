package com.sml.springbootcrud.web;

import com.sml.springbootcrud.domain.posts.PostsRepository;
import com.sml.springbootcrud.domain.posts.dto.posts.PostsDeleteRequestDTO;
import com.sml.springbootcrud.domain.posts.dto.posts.PostsSaveRequestDTO;
import com.sml.springbootcrud.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDTO dto){
        System.out.println(dto.getAuthor());
        postsService.save(dto);
    }

    @DeleteMapping("/posts")
    public void deletePosts(@RequestBody PostsDeleteRequestDTO dto){
        postsService.delete(dto);
    }

}
