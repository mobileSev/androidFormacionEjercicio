package com.everis.domain

class Team (
    val city : String?,
    val fullName : String,
    val teamId : Int,
    val nickname : String,
    val logo : String,
    val shortName : String,
    val allStar : Int,
    val nbaFranchise : Int,
    val leagues : List<String>?
)