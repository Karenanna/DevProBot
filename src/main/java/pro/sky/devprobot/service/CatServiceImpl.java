package pro.sky.devprobot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.devprobot.models.Shelter;
import pro.sky.devprobot.repositories.CatsRepository;

@Service
    public class CatsServiceImpl implements PetService {

        private final CatsRepository catsRepository;

        private final Shelter shelter;

        @Autowired
        public CatsServiceImpl(CatsRepository catsRepository, @Qualifier("catShelter") Shelter shelter) {
            shelter.getAllAnimalsFromDB(catsRepository.findAll());
            this.catsRepository = catsRepository;
            this.shelter = shelter;
        }

        @Override
        public Shelter getShelter(){
            return shelter;
        }


    }

