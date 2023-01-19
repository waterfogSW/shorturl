package com.waterfogsw.shorturl.url.domain

class ShortenURL(
  val targetURL: String,
  val shortURL: String,
) {

  companion object {
    const val base62Chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    fun shortURL(
      host: String,
      targetURL: String
    ): String {
      var shortURL = ""
      var id = targetURL.hashCode().toULong()
      while (id > 0u) {
        shortURL += base62Chars[(id % 62u).toInt()]
        id /= 62u
      }
      return "$host/$shortURL"
    }
  }
}
