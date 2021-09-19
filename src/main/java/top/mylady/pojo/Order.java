package top.mylady.pojo;
import lombok.Data;
import java.util.Date;


/**
 * 使用数据库为leyou数据库, 订单表里的字段有大量隐藏, 这里没有写处理
 * 这里只做关联查询演示
 */
@Data
public class Order {

    private Long id;
    private Date createTime;
    private Long order_id;

    private User user;
}
