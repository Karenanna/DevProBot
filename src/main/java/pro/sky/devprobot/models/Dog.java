package pro.sky.devprobot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
    @Table(name = "dogs")
    @Getter
    @Setter
    @NoArgsConstructor
    public class Dog extends Animal {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(referencedColumnName = "petowner_id")
        private PetOwner petOwner;

        public Dog(Long id, String nickname, boolean isChipped, LocalDateTime registeredAt, Shelter dogShelter, PetOwner petOwner) {
            super(nickname, isChipped, registeredAt, dogShelter);
            this.id = id;
            this.petOwner = petOwner;
        }
    }

