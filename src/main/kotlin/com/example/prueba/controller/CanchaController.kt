package com.example.prueba.controller

import com.example.prueba.Dto.NombreDto
import com.example.prueba.model.AgeView
import com.example.prueba.model.Cancha

import com.example.prueba.service.CanchaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cancha")

class CanchaController {

    @Autowired
    lateinit var canchaService: CanchaService

    @GetMapping
    fun List():List<Cancha>{
        return canchaService.list()
    }

    @PostMapping

    fun save (@RequestBody cancha: Cancha): Cancha {
        return canchaService.save(cancha)
    }

    @PutMapping
    fun update (@RequestBody cancha: Cancha): Cancha{
        return canchaService.update(cancha)
    }
    @PatchMapping
    fun updateName(@RequestBody cancha: Cancha): Cancha{
        return canchaService.updateName(cancha)
    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long): Boolean{
        return canchaService.delete(id )
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Cancha?{
        return canchaService.getById(id)
    }

    @GetMapping("/hora/{hora}")
    fun listByHora (@PathVariable("hora") hora: Long): List<Cancha>?{
        return  canchaService.getByHora(hora)
    }
    @PostMapping("/change/name")
    fun updateOtherName (@RequestBody nombreDto: NombreDto): String?{
        return canchaService.updateOtherName(nombreDto)
    }

    @GetMapping("/frequency/hora")
    fun listAgeView (): List<AgeView>?{
        return canchaService.listAgeView()
    }

}