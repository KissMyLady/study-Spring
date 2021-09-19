package top.mylady.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.mylady.mappers.UserMapper;
import top.mylady.pojo.Order;
import top.mylady.pojo.User;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    //查询全部订单[含用户]
    public List<Order> findAllOrder(){
        return userMapper.findAllOrder();
    }

    //一对多, 查询全部用户下的全部订单
    public List<User> f_User_leftJoin_Order(){
        return userMapper.f_Order_leftJoin_User();
    }
}
