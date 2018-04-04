package com.timetableforicu_serverside.timetableforicu_server.domain.service.noClassInfo

import com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo.NoClassInfoModel
import java.util.*

interface NoClassInfoService {

    fun findById(id:Int): NoClassInfoModel
    fun findAll():List<NoClassInfoModel>
    fun findByDate(date: Date):List<NoClassInfoModel>
}