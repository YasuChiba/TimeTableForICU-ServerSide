package com.timetableforicu_serverside.timetableforicu_server.domain.repository

import com.timetableforicu_serverside.timetableforicu_server.domain.model.TestModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface TestRepository : JpaRepository<TestModel, Int>