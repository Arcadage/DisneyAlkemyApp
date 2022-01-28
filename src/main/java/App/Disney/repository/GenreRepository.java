package App.Disney.repository;

import App.Disney.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Le indicamos a Spring de que esto es un repositorio
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {

}
