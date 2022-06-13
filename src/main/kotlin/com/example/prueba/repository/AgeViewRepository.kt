package com.example.prueba.repository

import com.example.prueba.model.AgeView
import org.springframework.data.jpa.repository.JpaRepository

interface AgeViewRepository: JpaRepository<AgeView, String> {
}