package cn.huangzijian888.order.repository;

import cn.huangzijian888.order.entity.Role;
import cn.huangzijian888.order.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author huangzijian888
 */
public interface RoleRepository extends JpaRepository<Role, Integer>, JpaSpecificationExecutor<Role> {
}
