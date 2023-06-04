package pro.sky.devprobot.service;

import pro.sky.devprobot.models.PetOwner;

public interface PetOwnersService {
    String addNewOwnerToDB(PetOwner petOwner);

    String addNewPetOwnerToDB(PetOwner petOwner);
}
