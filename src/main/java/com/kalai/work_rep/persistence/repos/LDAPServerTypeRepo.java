package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.LDAPServerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LDAPServerTypeRepo extends JpaRepository<LDAPServerType, Long> {
}
