package cn.huangzijian888.order.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author huangzijian888
 */
@Entity
@Data
public class Product {


    /**
     * 商品 ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    /**
     * 商品类别
     */
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品图片地址
     */
    private String imageUrl;
    /**
     * 商品详细信息
     */
    private String productInformation;
    /**
     * 商品价格
     */
    private Double price;

    /**
     * 商品状态
     */
    private Byte productState;

    public Product() {
    }

}
