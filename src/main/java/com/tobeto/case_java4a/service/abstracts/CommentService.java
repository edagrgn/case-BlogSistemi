package com.tobeto.case_java4a.service.abstracts;

import javax.xml.stream.events.Comment;
import java.util.List;

public interface CommentService {
    Comment save(Comment comment);
    List<Comment> findAll();
    Comment findById(Long id);
    void deleteById(Long id);
}
