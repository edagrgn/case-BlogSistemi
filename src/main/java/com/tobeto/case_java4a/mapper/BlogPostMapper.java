package com.tobeto.case_java4a.mapper;

import com.tobeto.case_java4a.dtos.BlogPostDTO;
import com.tobeto.case_java4a.model.entity.BlogPost;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(uses = {CommentMapper.class, UserMapper.class})

public interface BlogPostMapper {

    BlogPostMapper INSTANCE = Mappers.getMapper(BlogPostMapper.class);

    BlogPostDTO toBlogPostDTO(BlogPost blogPost);
    BlogPost toBlogPost(BlogPostDTO blogPostDTO);
}
