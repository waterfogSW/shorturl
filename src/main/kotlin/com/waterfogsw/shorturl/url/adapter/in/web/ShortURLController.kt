package com.waterfogsw.shorturl.url.adapter.`in`.web

import com.waterfogsw.shorturl.common.architecture.WebAdapter
import com.waterfogsw.shorturl.url.adapter.`in`.web.dto.ShortURLRequest
import com.waterfogsw.shorturl.url.application.port.`in`.ShortURLCommand
import com.waterfogsw.shorturl.url.application.port.`in`.ShortURLUseCase
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

@WebAdapter
@RestController
class ShortURLController(
  private val shortURLUseCase: ShortURLUseCase
) {

  @PostMapping("api/v1/shortURL")
  fun shortURL(
    @Valid @RequestBody
    request: ShortURLRequest
  ) {
    val command = ShortURLCommand(request.targetURL)
    shortURLUseCase.shortURL(command)
  }
}
