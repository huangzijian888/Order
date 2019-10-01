package cn.huangzijian888.order.repository;

import cn.huangzijian888.order.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author huangzijian888
 */
@CrossOrigin
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
