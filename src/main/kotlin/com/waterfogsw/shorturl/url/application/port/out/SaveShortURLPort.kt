package com.waterfogsw.shorturl.url.application.port.out

import com.waterfogsw.shorturl.url.domain.ShortenURL

interface SaveShortURLPort {

  fun save(shortenURL: ShortenURL): ShortenURL

}
