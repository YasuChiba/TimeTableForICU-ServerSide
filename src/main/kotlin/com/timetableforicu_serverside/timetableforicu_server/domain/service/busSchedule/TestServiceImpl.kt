package com.timetableforicu_serverside.timetableforicu_server.domain.service.busSchedule

import com.timetableforicu_serverside.timetableforicu_server.domain.model.busSchedule.TestModel
import com.timetableforicu_serverside.timetableforicu_server.domain.repository.busSchedule.TestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


/*
@Service
class TestServiceImpl @Autowired constructor(private val testRepository: TestRepository): TestService {

    override fun findAll(): List<TestModel> {
        return testRepository.findAll()
    }

    override fun findById(id: Int): TestModel {
        val data = testRepository.findById(id)
        if(data != null) {
            return data.get()
        } else {
            return TestModel(-1, "not found")
        }
    }
}
  */