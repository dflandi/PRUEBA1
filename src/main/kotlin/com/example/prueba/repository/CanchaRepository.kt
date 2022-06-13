package com.example.prueba.repository

import com.example.prueba.model.Cancha
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface CanchaRepository: JpaRepository<Cancha,Long> {

    fun findById(id:Long?): Cancha?
    @Query(nativeQuery=true)
    fun getListHour (@Param("hora")hora:Long?) : List <Cancha>?

    @Modifying
    @Query(nativeQuery=true)
    fun setOtherName (@Param("nombre")  name:String?, @Param("newNombre")  newNombre:String?) : Integer?

}