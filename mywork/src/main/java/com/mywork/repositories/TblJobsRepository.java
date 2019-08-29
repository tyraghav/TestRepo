package com.mywork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mywork.entities.TblJob;

public interface TblJobsRepository extends JpaRepository<TblJob, String> {

}
