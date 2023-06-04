package pro.sky.devprobot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.devprobot.models.PetOwner;
import pro.sky.devprobot.repositories.PetOwnersRepository;

@Service
    public class PetOwnersServiceImpl implements PetOwnersService{

        private final PetOwnersRepository petOwnersRepository;

        @Autowired
        public PetOwnersServiceImpl(PetOwnersRepository petOwnersRepository) {
            this.petOwnersRepository = petOwnersRepository;
        }

        @Override
        public String addNewPetOwnerToDB(PetOwner petOwner){
            if(petOwner != null) {
                petOwnersRepository.save(petOwner);
                return "Новый потенциальный владелец добавлен в базу";
            }
            return "Новый владелец не добавлен";
        }


    }
}
