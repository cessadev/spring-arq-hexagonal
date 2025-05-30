package com.cessadev.hexagonal_template.infrastructure.persistence.domain.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

/**
 * <p>JPA entity representing the application domain in the database.
 * The application domain must be mapped to this entity and vice versa before and after interacting with the database, thus complying with the decoupling principle.</p>
 *
 * <p>The aforementioned mapping must be performed on the adapter of the corresponding domain repository's output port.</p>
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "domain_jpa_example")
public class DomainJpaEntity {

  @Id
  private UUID id = UUID.randomUUID();

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    DomainJpaEntity that = (DomainJpaEntity) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
