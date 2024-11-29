package iitu.edu.kz.repository;

import iitu.edu.kz.entity.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findByAuthorId(Long id);

    Page<News> findAll(Pageable pageable);
}
