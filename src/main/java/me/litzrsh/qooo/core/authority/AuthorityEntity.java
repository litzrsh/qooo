package me.litzrsh.qooo.core.authority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import me.litzrsh.qooo.core.constants.Role;
import me.litzrsh.qooo.core.entity.MetaEntity;

import javax.persistence.*;

@Entity
@Table(name = "LZ_AUTHOR")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityEntity extends MetaEntity {

    @Id
    @Column(name = "AUTHOR_ID")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "AUTHOR_TY")
    private Role role;

    @Column(name = "AUTHOR_NM")
    private String name;

    @Column(name = "AUTHOR_DC")
    private String description;

    @Column(name = "USE_YN")
    private Boolean use;
}
