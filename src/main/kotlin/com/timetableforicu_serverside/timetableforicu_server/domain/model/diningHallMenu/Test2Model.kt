package com.timetableforicu_serverside.timetableforicu_server.domain.model.diningHallMenu

import javax.persistence.*


@Entity
@Table(name = "testtable2")
class Test2Model(
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column
        var id: Int = 0,
        @Column
        var text: String = ""
)