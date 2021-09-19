package top.mylady.mappers;
import org.apache.ibatis.annotations.Param;
import top.mylady.pojo.Order;
import top.mylady.pojo.User;
import java.util.List;


public interface UserMapper {

    //查询全部订单[含用户]
    List<Order> findAllOrder();

    //一对多查询, 查询用户的订单
    List<User> f_Order_leftJoin_User();
}
