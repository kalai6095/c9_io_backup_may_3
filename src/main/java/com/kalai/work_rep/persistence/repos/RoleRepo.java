package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
