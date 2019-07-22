package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.LDAPSystemConfigform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LDAPSystemConfigformRepo<T extends Long> extends JpaRepository<LDAPSystemConfigform, Long> {
}
