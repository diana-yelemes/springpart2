package iitu.edu.kz.service;

import iitu.edu.kz.entity.NewsTag;
import iitu.edu.kz.repository.NewsTagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NewsTagService {

    private final NewsTagRepository newsTagRepository;

    public List<NewsTag> readAll() {
        return newsTagRepository.findAll();
    }

    public NewsTag create(NewsTag newsTag) {
        return newsTagRepository.save(newsTag);
    }

    public void delete(Long id) {
        newsTagRepository.deleteById(id);
    }
}
