# 当前项目简单介绍


## Mybatis的关联查询
- 1, 关联查询
关联查询参考GitHub笔记: 
   https://github.com/KissMyLady/MySQL/blob/master/Note/select_join_on.md


- 2, 多对多查询: 
多对多查询参考: https://blog.mylady.top/blog/article/170
SQL:
```sql
    select * from user as u 
            left  join user_role as ur on u.id       = ur.user_id
            inner join role      as r on ur.role_id = r.id
```
 
配置的 Mapper同一对多查询一样, 使用collection集合包裹多list列表     
看起来像是这样: 
```xml
<resultMap id="userRoleMap" type="com.itheima.domain.User">
    <result column="id" property="id"></result>
    <result column="username" property="username"></result>
    <result column="password" property="password"></result>
    <result column="birthday" property="birthday"></result>
    <collection property="roleList" ofType="com.itheima.domain.Role">
        <result column="rid" property="id"></result>
        <result column="rolename" property="rolename"></result>
    </collection>
</resultMap>
<select id="findAllUserAndRole" resultMap="userRoleMap">
    select u.*,r.*,r.id rid from user u left join user_role ur on u.id=ur.user_id
    inner join role r on ur.role_id=r.id
</select>
```



## Maven依赖版本
1, 略