package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.LDAPServerInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LDAPServerInformationRepo extends JpaRepository< LDAPServerInformation,Long> {
}
