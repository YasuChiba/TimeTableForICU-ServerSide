package com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "no_class_info")
class NoClassInfoModel(
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column
        var id: Int = 0,

        @Column
        var no_class_date: Date = Date(),

        @Column
        var no_class_period : String = "",

        @Column
        var course_no : String = "",

        @Column
        var english_course_title : String = "",

        @Column
        var japanese_course_title : String = "",

        @Column
        var instructor : String = "",

        @Column
        var makeup : String = ""
)