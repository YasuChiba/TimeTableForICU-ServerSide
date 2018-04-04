package com.timetableforicu_serverside.timetableforicu_server.controller

import com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo.NoClassInfoModel
import com.timetableforicu_serverside.timetableforicu_server.domain.service.noClassInfo.NoClassInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/noclass-info")
class NoClassInfoController @Autowired constructor(private val service: NoClassInfoService){

    @GetMapping("/byId")
    fun id(@RequestParam(value="id", defaultValue= "-1") id:Int): NoClassInfoModel {
        return service.findById(id)
    }

    @GetMapping("/all")
    fun all() : List<NoClassInfoModel>{
        return service.findAll()
    }

    @GetMapping("/today","/date")
    fun today(): List<NoClassInfoModel>{
        return service.findByDate(Date())
    }

    @GetMapping("/date/{date}")
    fun byDate(@PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd") date:Date): List<NoClassInfoModel>{
        return service.findByDate(date)
    }
}