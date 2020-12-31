package me.litzrsh.qooo.core.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import me.litzrsh.qooo.core.entity.MetaEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LZ_USER_AUTHOR")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthorityEntity extends MetaEntity {

    @EmbeddedId
    private UserAuthorityPk id;

    @Embeddable
    @Data
    @EqualsAndHashCode(callSuper = false)
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserAuthorityPk implements Serializable {

        @Column(name = "USER_ID")
        private Long userId;

        @Column(name = "AUTHOR_ID")
        private Long authorityId;
    }
}
