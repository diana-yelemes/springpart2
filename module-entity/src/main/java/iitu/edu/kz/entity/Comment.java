package iitu.edu.kz.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Content is required")
    @Size(min = 3, max = 255, message = "Content must be between 3 and 255 characters")
    private String content;

    @ManyToOne
    @JoinColumn(name = "news_id")
    private News news;

    private LocalDate createDate;

    private LocalDate lastUpdateDate;
}
