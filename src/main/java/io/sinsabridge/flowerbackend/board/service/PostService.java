package io.sinsabridge.flowerbackend.board.service;

import io.sinsabridge.flowerbackend.board.Post;

import java.util.List;

public interface PostService {
    List<Post> findAllPosts();

    Post findPostById(Long id);

    void createPost(Post post);

    void updatePost(Post post);

    void deletePostById(Long id);
}