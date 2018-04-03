package com.timetableforicu_serverside.timetableforicu_server.domain.model.busSchedule

import javax.persistence.*


@Entity
@Table(name = "testtable")
class BusScheduleModel(
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column
        var id: Int = 0,
        @Column
        var name: String = ""
)