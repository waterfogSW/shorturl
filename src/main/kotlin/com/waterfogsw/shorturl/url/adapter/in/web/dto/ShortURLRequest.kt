package com.waterfogsw.shorturl.url.adapter.`in`.web.dto

import jakarta.validation.constraints.NotBlank

class ShortURLRequest {

  @NotBlank
  val targetURL: String = ""

}
