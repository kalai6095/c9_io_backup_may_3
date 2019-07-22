package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.AccessControlGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessControlGroupRepo extends JpaRepository<AccessControlGroup, Long> {
}
