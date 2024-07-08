package com.nvz.gl309_8_1_sp14_spring_security.services;

import com.nvz.gl309_8_1_sp14_spring_security.model.Role;

import java.util.List;

public interface RoleService {
    public void saveRole(Role role);
    public Role findRoleByRoleName(String name);
    public List<Role> getAllRoles();
    public List<Role> getRolesByUser(long id);

}
