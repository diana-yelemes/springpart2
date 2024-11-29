package iitu.edu.kz.service;

import iitu.edu.kz.dto.NewsDTO;
import iitu.edu.kz.entity.News;
import iitu.edu.kz.repository.NewsRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;
    private final AuthorService authorService;

    public News create(NewsDTO dto) {
        News news = News.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .createDate(LocalDate.now())
                .lastUpdateDate(LocalDate.now())
                .author(authorService.readById(dto.getAuthorId()))
                .build();

        return newsRepository.save(news);
    }

    public Page<News> readAll(Pageable pageable) {
        return newsRepository.findAll(pageable);
    }

    public void delete(Long id) {
        newsRepository.deleteById(id);
    }
}
