package pro.sky.devprobot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.devprobot.models.Cat;

@Repository
public interface CatsRepository extends JpaRepository<Cat, Long> {
}
