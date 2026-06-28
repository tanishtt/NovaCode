package dev.tanishmohanta.NovaCode.repository;

import dev.tanishmohanta.NovaCode.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

//    @Query("""
//        select p from Project p
//        where p.deletedAt is null
//        and (p.owner.id = :userId or exists( select 1 from p.members m where m.id = :userId) )
//        order by p.updatedAt desc
//        """)
@Query("""
        select p from Project p
        where p.deletedAt is null
        and p.owner.id = :userId
        """)
    List<Project> findAllAccessibleProjectsByUser(@Param("userId") Long userId);
}
