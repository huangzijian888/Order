package cn.huangzijian888.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author huangzijian888
 */
@Entity
@Data
public class BasicInformation {
    @Id
    private Integer uid;
    private Integer personNum;
    private String mark;

    public BasicInformation() {
    }

    public BasicInformation(Integer uid, Integer personNum, String mark) {
        this.uid = uid;
        this.personNum = personNum;
        this.mark = mark;
    }
}
