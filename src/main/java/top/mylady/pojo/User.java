package top.mylady.pojo;
import lombok.Data;
import java.util.Date;
import java.util.List;


@Data
public class User {

    private Long id;
    private String username;
    private String password;
    private String phone;

    private Date created;

    private String salt;

    private List<Order> orders;
}
