package com.zhao.service.Impl;

import com.zhao.dao.AdminDao;
import com.zhao.pojo.Admin;
import com.zhao.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Integer addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }

    @Override
    public List<Admin> findAdminByAminName(String adminName) {
        return adminDao.findAdminByAminName(adminName);
    }
}
