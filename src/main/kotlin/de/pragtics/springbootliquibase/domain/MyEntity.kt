package de.pragtics.springbootliquibase.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class MyEntity {

    @Id
    lateinit var identifier: String

    lateinit var property1: String

    var property2: Int = -1

//    var property3: Boolean = false
}