package com.tobeto.case_java4a.dtos;

import java.time.LocalDateTime;
import java.util.List;

public class BlogPostDTO {

    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime publishedDate;
    private List<CommentDTO> comments;
}
