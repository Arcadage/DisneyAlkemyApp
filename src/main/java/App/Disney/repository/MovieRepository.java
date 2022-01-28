package App.Disney.repository;

import App.Disney.entity.MovieEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

    // Método para buscar a todos los que cumplan con ciertas especificaciones o filtros
    List<MovieEntity> findAll(Specification<MovieEntity> spec);

}
