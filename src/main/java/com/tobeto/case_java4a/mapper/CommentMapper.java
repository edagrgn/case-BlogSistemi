package com.tobeto.case_java4a.mapper;

import com.tobeto.case_java4a.dtos.CommentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.xml.stream.events.Comment;


@Mapper(uses = {UserMapper.class})
public interface CommentMapper {

    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);


    CommentDTO toCommentDTO(Comment comment);
    Comment toComment(CommentDTO commentDTO);
}
