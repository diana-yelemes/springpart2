package iitu.edu.kz.service;

import iitu.edu.kz.entity.Tag;
import iitu.edu.kz.repository.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TagService {

    private final TagRepository tagRepository;

    public List<Tag> readAll() {
        return tagRepository.findAll();
    }

    public Tag readById(Long id) {
        return tagRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Tag not found - " + id));
    }

    public Tag create(Tag tag) {
        return tagRepository.save(tag);
    }

    public void delete(Long id) {
        tagRepository.deleteById(id);
    }
}
