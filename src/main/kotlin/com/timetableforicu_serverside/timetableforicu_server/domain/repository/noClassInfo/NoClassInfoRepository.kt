package com.timetableforicu_serverside.timetableforicu_server.domain.repository.noClassInfo

import com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo.NoClassInfoModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface NoClassInfoRepository : JpaRepository<NoClassInfoModel, Long>