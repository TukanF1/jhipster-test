package com.altkom.szkolenie.spring_cloud_2.app.repository;

import com.altkom.szkolenie.spring_cloud_2.app.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
