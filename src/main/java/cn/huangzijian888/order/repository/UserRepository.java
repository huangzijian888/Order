package cn.huangzijian888.order.repository;

import cn.huangzijian888.order.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author huangzijian888
 */
@CrossOrigin
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    /**
     * 通过用户名查询用户
     *
     * @param username
     * @return
     */
    User findByUsername(String username);

    @PreAuthorize("hasRole('ADMIN')")
    @Override
    void deleteById(Long aLong);
}
