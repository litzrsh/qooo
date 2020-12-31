package me.litzrsh.qooo.core.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import me.litzrsh.qooo.core.authority.AuthorityEntity;
import me.litzrsh.qooo.core.entity.MetaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "LZ_USER")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserEntity extends MetaEntity {

    @Id
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "LOGIN_ID")
    private String username;

    @Column(name = "LOGIN_PWD")
    private String password;

    @Column(name = "USER_GENDER")
    private String gender;

    @Column(name = "USE_YN")
    private Boolean use;

    @Column(name = "EXPR_YN")
    private Boolean passwordExpired;

    @Column(name = "DEL_YN")
    private Boolean deleted;

    @Column(name = "LAST_LOGIN_DT")
    private Date lastLoginDate;

    @Column(name = "LAST_CHG_PWD_DT")
    private Date lastChangePasswordDate;
}
