package com.timetableforicu_serverside.timetableforicu_server.controller

import com.timetableforicu_serverside.timetableforicu_server.domain.model.TestModel
import com.timetableforicu_serverside.timetableforicu_server.domain.repository.TestRepository
import com.timetableforicu_serverside.timetableforicu_server.domain.service.TestService
import org.aspectj.weaver.ast.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController @Autowired constructor(private val testService: TestService){

    @GetMapping("/byId")
    fun id(@RequestParam(value="id", defaultValue= "-1") id:Int): TestModel{
        return testService.findById(id)
    }

    @GetMapping("/all")
    fun all() : List<TestModel>{
        return testService.findAll()
    }

}