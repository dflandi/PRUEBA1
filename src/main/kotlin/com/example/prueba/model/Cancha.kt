package com.example.prueba.model

import javax.persistence.*

@Entity
@Table(name="Cancha")
class Cancha{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable=false)

        var id: Long? = null
        var nombre: String?= null
        var hora: Long? = null
        var cancha: String? = null

}