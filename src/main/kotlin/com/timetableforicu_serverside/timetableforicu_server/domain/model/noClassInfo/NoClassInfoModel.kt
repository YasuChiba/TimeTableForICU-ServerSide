package com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo

import org.springframework.format.annotation.DateTimeFormat
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "no_class_info")
class NoClassInfoModel(
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column
        var id: Int = 0,

        @Column(name="no_class_date")
        var noClassDate: Date = Date(),

        @Column(name="no_class_period")
        var noCLassPeriod : String = "",

        @Column(name="course_no")
        var courseNo : String = "",

        @Column(name="english_course_title")
        var eCourseTitle : String = "",

        @Column(name="japanese_course_title")
        var jCourseTitle : String = "",

        @Column
        var instructor : String = "",

        @Column
        var makeup : String = ""
)