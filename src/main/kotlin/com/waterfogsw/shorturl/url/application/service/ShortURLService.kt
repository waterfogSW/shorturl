package com.waterfogsw.shorturl.url.application.service

import com.waterfogsw.shorturl.common.architecture.UseCase
import com.waterfogsw.shorturl.common.config.AppProperties
import com.waterfogsw.shorturl.url.application.port.`in`.ShortURLCommand
import com.waterfogsw.shorturl.url.application.port.`in`.ShortURLUseCase
import com.waterfogsw.shorturl.url.domain.ShortenURL

@UseCase
class ShortURLService(
  val appProperties: AppProperties
) : ShortURLUseCase {

  override fun shortURL(command: ShortURLCommand): String {
    val host = appProperties.url
    val shortenURL = ShortenURL.shortURL(host, command.targetURL)
    return shortenURL.shortURL
  }
}
