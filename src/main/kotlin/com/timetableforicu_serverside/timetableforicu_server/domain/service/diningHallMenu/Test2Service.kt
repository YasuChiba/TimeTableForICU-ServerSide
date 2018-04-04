package com.timetableforicu_serverside.timetableforicu_server.domain.service.diningHallMenu

import com.timetableforicu_serverside.timetableforicu_server.domain.model.diningHallMenu.Test2Model

interface Test2Service {

    fun findById(id:Int): Test2Model
    fun findAll():List<Test2Model>
}