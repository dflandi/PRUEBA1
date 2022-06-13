package com.example.prueba.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="age_view")

class AgeView {
    @Id
    @Column(updatable = false)
    var age: String? = null
    var frecuency: Long? = null
}