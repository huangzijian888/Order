package cn.huangzijian888.order.repository;

import cn.huangzijian888.order.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huangzijian888
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
