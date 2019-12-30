package com.zhao.eq;


import com.zhao.pojo.Admin;
import com.zhao.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-mapper.xml"})
public class Test1 {
    @Autowired
    private AdminService adminService;
    @Test
    public void addAdmin()
    {
        Admin admin=new Admin();
        admin.setAdminName("赵旭东");
        admin.setAddress("西安");
        admin.setAdminPwd("123456");
        admin.setSex((short)1);
        Integer result=adminService.addAdmin(admin);
        System.out.print(result);
    }
}
