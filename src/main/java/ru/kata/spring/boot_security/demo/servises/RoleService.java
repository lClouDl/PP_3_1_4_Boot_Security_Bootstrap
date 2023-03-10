package ru.kata.spring.boot_security.demo.servises;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findById(int id);
    void save(Role role);
    void update(int id, Role roleUpdate);
    void delete(int id);
}
