package pro.sky.devprobot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.devprobot.models.Dog;

@Repository
public interface DogsRepository extends JpaRepository <Dog, Long> {
}
