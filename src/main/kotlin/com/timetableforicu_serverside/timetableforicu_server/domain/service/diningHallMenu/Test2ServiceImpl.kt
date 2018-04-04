package com.timetableforicu_serverside.timetableforicu_server.domain.service.diningHallMenu

import com.timetableforicu_serverside.timetableforicu_server.domain.model.diningHallMenu.Test2Model
import com.timetableforicu_serverside.timetableforicu_server.domain.repository.diningHallMenu.Test2Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/*
@Service
class Test2ServiceImpl @Autowired constructor(private val testRepository: Test2Repository):Test2Service {

    override fun findAll(): List<Test2Model> {
        return testRepository.findAll()
    }

    override fun findById(id: Int): Test2Model {
        val data = testRepository.findById(id)
        if(data != null) {
            return data.get()
        } else {
            return Test2Model(-1, "not found")
        }
    }
}*/