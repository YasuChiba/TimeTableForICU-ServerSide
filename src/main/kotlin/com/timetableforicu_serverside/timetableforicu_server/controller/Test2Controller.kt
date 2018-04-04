package com.timetableforicu_serverside.timetableforicu_server.controller

import com.timetableforicu_serverside.timetableforicu_server.domain.model.diningHallMenu.Test2Model
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


/*

@RestController
@RequestMapping("/test2")
class Test2Controller @Autowired constructor(private val testService: Test2ServiceImpl){

    @GetMapping("/byId")
    fun id(@RequestParam(value="id", defaultValue= "-1") id:Int): Test2Model {
        return testService.findById(id)
    }

    @GetMapping("/all")
    fun all() : List<Test2Model>{
        return testService.findAll()
    }

}

 */