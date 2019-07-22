package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.LDAPAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LDAPAttributeRepo extends JpaRepository<LDAPAttribute,Long> {
}
