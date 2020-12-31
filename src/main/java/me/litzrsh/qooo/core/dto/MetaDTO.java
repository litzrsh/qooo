package me.litzrsh.qooo.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaDTO implements Serializable {

    private Date createDate;

    @JsonIgnore
    private Long createId;

    private Date updateDate;

    @JsonIgnore
    private Long updateId;

    public String getCreatorName() {
        return null;
    }

    public String getUpdaterName() {
        return null;
    }
}
