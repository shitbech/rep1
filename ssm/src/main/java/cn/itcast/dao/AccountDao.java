package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {

    /**
     * 保存用户
     * */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);


    /**
     * 查询所有用户
     * */
    @Select("select * from account")
    public List<Account> findAll();
}
