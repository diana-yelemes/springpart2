package iitu.edu.kz.controller;

import iitu.edu.kz.entity.NewsTag;
import iitu.edu.kz.service.NewsTagService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/newsTags")
@AllArgsConstructor
public class NewsTagController {

    private final NewsTagService newsTagService;

    @PostMapping
    public ResponseEntity<NewsTag> create(@RequestBody NewsTag newsTag) {
        return ResponseEntity.ok(newsTagService.create(newsTag));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        newsTagService.delete(id);
        return ResponseEntity.ok().build();
    }
}
