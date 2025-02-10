package com.devdeolho.hexagonal.adapters.`in`.controller.request

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class CustomerRequest(
    @field:NotBlank(message = "name must not be blank")
    val name: String,
    @field:NotBlank(message = "cpf must not be blank")
    @field:Min(11)
    @field:Max(11)
    val cpf: String,
    @field:NotBlank(message = "zipCode must not be blank")
    @field:Min(8)
    @field:Max(8)
    val zipCode: String
)
