package com.waterfogsw.shorturl.url.adapter.out.persistence

import com.waterfogsw.shorturl.common.architecture.PersistenceAdapter
import com.waterfogsw.shorturl.url.application.port.out.SaveShortenURLPort
import com.waterfogsw.shorturl.url.domain.ShortenURL

@PersistenceAdapter
class ShortenURLPersistenceAdapter(
  val shortenURLRepository: ShortenURLRepository,
  val shortenURLMapper: ShortenURLMapper,
) : SaveShortenURLPort {

  override fun save(shortenURL: ShortenURL): ShortenURL {
    val newJPAEntity = shortenURLMapper.mapToJpaEntity(shortenURL)
    val savedJPAEntity = shortenURLRepository.save(newJPAEntity)
    return shortenURLMapper.mapToDomainEntity(savedJPAEntity)
  }

}
