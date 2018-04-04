package com.timetableforicu_serverside.timetableforicu_server.domain.service.noClassInfo

import com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo.NoClassInfoModel
import com.timetableforicu_serverside.timetableforicu_server.domain.repository.noClassInfo.NoClassInfoRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class NoClassInfoServiceImpl @Autowired constructor(private val repository: NoClassInfoRepository):NoClassInfoService {

    override fun findAll(): List<NoClassInfoModel> {
        return repository.findAll()
    }

    override fun findById(id: Long): NoClassInfoModel{
        val data = repository.findById(id)
        return data.get()
    }
}