package com.timetableforicu_serverside.timetableforicu_server.controller

import com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo.NoClassInfoModel
import com.timetableforicu_serverside.timetableforicu_server.domain.service.noClassInfo.NoClassInfoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired


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

}