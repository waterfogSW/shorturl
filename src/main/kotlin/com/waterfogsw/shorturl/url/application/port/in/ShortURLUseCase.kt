package com.waterfogsw.shorturl.url.application.port.`in`

import com.waterfogsw.shorturl.url.domain.ShortenURL

interface ShortURLUseCase {

  fun shortURL(command: ShortURLCommand): ShortURLResponse

}

data class ShortURLResponse(
  val shortURL: String,
  val targetURL: String,
) {
  companion object {
    fun from(shortenURL: ShortenURL): ShortURLResponse {
      return ShortURLResponse(shortenURL.shortURL, shortenURL.targetURL)
    }

  }

}
