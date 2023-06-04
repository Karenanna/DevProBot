package pro.sky.devprobot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.devprobot.models.Shelter;
import pro.sky.devprobot.repositories.DogsRepository;

@Service
    public class DogsServiceImpl implements PetService {

        private final DogsRepository dogsRepository;

        private final Shelter shelter;

        @Autowired
        public DogsServiceImpl(DogsRepository dogsRepository, @Qualifier("dogShelter") Shelter shelter) {
            shelter.getAllAnimalsFromDB(dogsRepository.findAll());
            this.dogsRepository = dogsRepository;
            this.shelter = shelter;
        }


        @Override
        public Shelter getShelter() {
            return shelter;
        }
    }

