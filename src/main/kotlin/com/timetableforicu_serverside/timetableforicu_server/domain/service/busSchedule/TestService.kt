package com.timetableforicu_serverside.timetableforicu_server.domain.service.busSchedule

import com.timetableforicu_serverside.timetableforicu_server.domain.model.busSchedule.TestModel


interface TestService {

    fun findById(id:Int): TestModel
    fun findAll():List<TestModel>
}