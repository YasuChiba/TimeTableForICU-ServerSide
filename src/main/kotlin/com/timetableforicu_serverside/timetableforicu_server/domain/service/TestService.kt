package com.timetableforicu_serverside.timetableforicu_server.domain.service

import com.timetableforicu_serverside.timetableforicu_server.domain.model.TestModel


interface TestService {

    fun findById(id:Int):TestModel
    fun findAll():List<TestModel>
}