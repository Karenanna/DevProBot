package pro.sky.devprobot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.devprobot.models.PetOwner;

@Repository
public interface PetOwnersRepository extends JpaRepository<PetOwner, Long> {
}
