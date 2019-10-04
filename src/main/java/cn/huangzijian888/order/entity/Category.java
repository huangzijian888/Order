package cn.huangzijian888.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author huangzijian888
 */
@Entity
@Data
public class Category {

    /**
     * 分类 ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    /**
     * 分类名称
     */
    private String categoryName;


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> productList;

    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
