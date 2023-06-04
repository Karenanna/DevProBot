package pro.sky.devprobot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
    @AllArgsConstructor
    @RequiredArgsConstructor
    public abstract class Animal {

        @Column(name = "nickname")
        private String nickName;

        @Column(name = "is_chipped")
        private boolean isChipped;

        @Column(name = "registered_at")
        private LocalDateTime registeredAt;

        @Column(name = "shelter")
        @Enumerated(EnumType.STRING)
        private Shelter shelter;

    }
