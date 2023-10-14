package org.application.repository;

import org.application.entity.IPhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneRepository extends JpaRepository<IPhone,Long> {

}
