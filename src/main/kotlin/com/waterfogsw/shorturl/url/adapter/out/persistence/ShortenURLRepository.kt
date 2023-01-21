package com.waterfogsw.shorturl.url.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface ShortenURLRepository : JpaRepository<ShortenURLJPAEntity, Long>
