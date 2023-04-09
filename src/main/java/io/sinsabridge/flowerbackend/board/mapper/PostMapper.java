package io.sinsabridge.flowerbackend.board.mapper;

import io.sinsabridge.flowerbackend.board.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAllPosts();

    Post findPostById(Long id);

    void insertPost(Post post);

    void updatePost(Post post);

    void deletePostById(Long id);
}
