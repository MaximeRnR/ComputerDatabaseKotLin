package com.computerdatabase.kotlin.cdbkotlin.model


import java.time.LocalDate

/**
 * Created by mreynier on 01/08/17.
 */

data class Computer(val id: Long,
                    val name: String,
                    val dateOfIntroduction: LocalDate?,
                    val dateOfDiscontinuation: LocalDate?,
                    val company: Company?)