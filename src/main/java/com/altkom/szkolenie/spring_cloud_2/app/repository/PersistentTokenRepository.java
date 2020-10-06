package com.altkom.szkolenie.spring_cloud_2.app.repository;

import com.altkom.szkolenie.spring_cloud_2.app.domain.PersistentToken;
import com.altkom.szkolenie.spring_cloud_2.app.domain.User;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link PersistentToken} entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {
    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);
}
