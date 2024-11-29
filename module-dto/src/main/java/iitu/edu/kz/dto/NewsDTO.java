package iitu.edu.kz.dto;


import lombok.Data;

@Data
public class NewsDTO {

    private String title;
    private String content;
    private Long authorId;
}
