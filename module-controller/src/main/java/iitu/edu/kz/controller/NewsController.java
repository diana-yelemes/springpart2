package iitu.edu.kz.controller;

import iitu.edu.kz.dto.NewsDTO;
import iitu.edu.kz.entity.News;
import iitu.edu.kz.service.NewsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
@AllArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @PostMapping
    public ResponseEntity<News> create(@RequestBody @Valid NewsDTO dto) {
        News createdNews = newsService.create(dto);
        return ResponseEntity.ok(newsService.create(dto));
    }

    @GetMapping
    public ResponseEntity<Page<News>> readAll(Pageable pageable) {
        return ResponseEntity.ok(newsService.readAll(pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        newsService.delete(id);
        return ResponseEntity.ok().build();
    }
}
