package com.waterfogsw.shorturl.url.application.service

import com.waterfogsw.shorturl.common.architecture.UseCase
import com.waterfogsw.shorturl.url.application.port.`in`.ShortURLCommand
import com.waterfogsw.shorturl.url.application.port.`in`.ShortURLUseCase

@UseCase
class ShortURLService : ShortURLUseCase {

  override fun shortURL(command: ShortURLCommand): Boolean {
    println(command.targetURL)
    //TODO : UseCase 구현
    return false
  }
}
