package io.sinsabridge.flowerbackend.board.service.impl;

import io.sinsabridge.flowerbackend.board.Post;
import io.sinsabridge.flowerbackend.board.mapper.PostMapper;
import io.sinsabridge.flowerbackend.board.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public List<Post> findAllPosts() {
        return postMapper.findAllPosts();
    }

    @Override
    public Post findPostById(Long id) {
        return postMapper.findPostById(id);
    }

    @Override
    public void createPost(Post post) {
        postMapper.insertPost(post);
    }

    @Override
    public void updatePost(Post post) {
        postMapper.updatePost(post);
    }

    @Override
    public void deletePostById(Long id) {
        postMapper.deletePostById(id);
    }
}