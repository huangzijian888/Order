package cn.huangzijian888.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author huangzijian888
 */
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;
    private String roleName;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private List<User> userList;

    public Role() {

    }

    public Role(String roleName) {
        this.roleName = roleName;
    }
}
