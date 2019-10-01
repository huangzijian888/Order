package cn.huangzijian888.order.repository;

import cn.huangzijian888.order.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huangzijian888
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
