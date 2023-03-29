package com.example.marvel.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stories (

  @field:Json(name = "available"     ) var available     : String?          = null,
  @field:Json(name = "returned"      ) var returned      : String?          = null,
  @field:Json(name = "collectionURI" ) var collectionURI : String?          = null,
  @field:Json(name = "items"         ) var items         : List<Items> = listOf()

)