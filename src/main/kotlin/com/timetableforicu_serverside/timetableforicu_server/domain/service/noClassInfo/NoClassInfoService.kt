package com.timetableforicu_serverside.timetableforicu_server.domain.service.noClassInfo

import com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo.NoClassInfoModel

interface NoClassInfoService {

    fun findById(id:Long): NoClassInfoModel
    fun findAll():List<NoClassInfoModel>
}