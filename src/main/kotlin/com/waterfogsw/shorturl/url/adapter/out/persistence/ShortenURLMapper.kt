package com.waterfogsw.shorturl.url.adapter.out.persistence

import com.waterfogsw.shorturl.url.domain.ShortenURL
import org.springframework.stereotype.Component

@Component
class ShortenURLMapper {

  fun mapToDomainEntity(shortenURLJPAEntity: ShortenURLJPAEntity): ShortenURL {
    return ShortenURL(shortenURLJPAEntity.targetURL, shortenURLJPAEntity.shortURL)
  }

  fun mapToJpaEntity(shortenURL: ShortenURL): ShortenURLJPAEntity {
    return ShortenURLJPAEntity(
      targetURL = shortenURL.targetURL,
      shortURL = shortenURL.shortURL,
    )
  }
}
