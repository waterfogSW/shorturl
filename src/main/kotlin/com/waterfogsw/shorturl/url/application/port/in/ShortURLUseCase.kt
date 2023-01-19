package com.waterfogsw.shorturl.url.application.port.`in`

interface ShortURLUseCase {

  fun shortURL(command: ShortURLCommand): String

}
