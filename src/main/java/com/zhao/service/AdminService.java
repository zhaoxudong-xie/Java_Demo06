package com.zhao.service;

import com.zhao.pojo.Admin;

import java.util.List;

public interface AdminService {
    Integer addAdmin(Admin admin);
    List<Admin> findAdminByAminName(String adminName);
}
