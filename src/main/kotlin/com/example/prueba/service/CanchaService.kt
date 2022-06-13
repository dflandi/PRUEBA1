package com.example.prueba.service

import com.example.prueba.Dto.NombreDto
import com.example.prueba.model.AgeView
import com.example.prueba.model.Cancha
import com.example.prueba.repository.AgeViewRepository
import com.example.prueba.repository.CanchaRepository



import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service

class CanchaService {
    @Autowired
    lateinit var canchaRepository: CanchaRepository

    fun  list(): List<Cancha>{
        return canchaRepository.findAll()
    }

    fun save(cancha: Cancha):Cancha{
        return canchaRepository.save(cancha)
    }

    fun update(cancha: Cancha): Cancha{
       val response= canchaRepository.findById(cancha.id)
            ?:throw Exception()
    response.nombre=cancha.nombre
        return canchaRepository.save(cancha)
    }

    fun updateName(cancha: Cancha): Cancha{
        val response=canchaRepository.findById(cancha.id)
            ?:throw  Exception()

        return canchaRepository.save(response)
    }
    fun delete (id:Long): Boolean{
        canchaRepository.deleteById(id)
        return true
    }
    fun getById (id: Long?): Cancha?{
        return canchaRepository.findById(id)
    }

    fun getByHora (hora: Long?):List<Cancha>?{
        return canchaRepository.getListHour(hora)
    }
    @Transactional
    fun updateOtherName (nombreDto: NombreDto): String?{
        val rowsUpdate=canchaRepository.setOtherName(nombreDto.nombre, nombreDto.newNombre)
        return "${rowsUpdate} rows updated"
    }

    @Autowired
    lateinit var ageViewRepository: AgeViewRepository

    /*resto del codigo*/


    fun listAgeView ():List<AgeView>{
        return ageViewRepository.findAll()
    }
}