package pro.sky.devprobot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import pro.sky.devprobot.configuration.ShelterType;

import java.util.List;

    @Data
    @AllArgsConstructor
    @RequiredArgsConstructor
    public class Shelter {

        private String name;

        private String description;

        private List<? extends Animal> animals;

        private ShelterType shelterType;

        public void getAllAnimalsFromDB(List<? extends Animal> animals) {
            this.animals = animals;
        }
    }

