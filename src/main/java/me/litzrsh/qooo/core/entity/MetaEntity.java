package me.litzrsh.qooo.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class MetaEntity implements Serializable {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REGIST_DT", updatable = false)
    private Date createDate;

    @Column(name = "REGIST_ID", updatable = false)
    private Long createId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDT_DT")
    private Date updateDate;

    @Column(name = "UPDT_ID")
    private Long updateId;
}
