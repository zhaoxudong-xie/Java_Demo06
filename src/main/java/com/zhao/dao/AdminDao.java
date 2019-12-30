package com.zhao.dao;

import com.zhao.mapper.AdminMapper;
import com.zhao.pojo.Admin;
import com.zhao.pojo.AdminExample;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Data
@Repository
public class AdminDao {
    @Autowired
    private AdminMapper adminMapper;
    public Integer addAdmin(Admin admin)
    {
        return adminMapper.insert(admin);
    }
    public List<Admin> findAdminByAminName(String adminName)
    {
        AdminExample adminExample=new AdminExample();
        adminExample.createCriteria().andAdminNameLike("%"+adminName+"%");
        return adminMapper.selectByExample(adminExample);
    }
}
