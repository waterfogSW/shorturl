package com.waterfogsw.shorturl.url.adapter.out.persistence

import jakarta.persistence.*

@Entity
@Table(name = "ShortenURL")
class ShortenURLJPAEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  @Column(nullable = false)
  var targetURL: String,

  @Column(nullable = false)
  var shortURL: String,
) {

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as ShortenURLJPAEntity

    if (id != other.id) return false

    return true
  }

  override fun hashCode(): Int {
    return id?.hashCode() ?: 0
  }
}
