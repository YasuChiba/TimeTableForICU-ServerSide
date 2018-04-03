package com.timetableforicu_serverside.timetableforicu_server.domain.repository.busSchedule

import com.timetableforicu_serverside.timetableforicu_server.domain.model.busSchedule.TestModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface TestRepository : JpaRepository<TestModel, Int>