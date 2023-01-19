package com.waterfogsw.shorturl.url.domain

import io.kotest.core.spec.style.DescribeSpec

class ShortenURLTest : DescribeSpec({
  describe("shortURL") {
    val targetURL = "https://www.google.co.kr/search?q=%EA%B5%AC%EA%B8%80%EA%B2%80%EC%83%89&sxsrf=AJOqlzUtEcxx0sRbFs_FmLrVuZaegc4pYQ%3A1674092493232&source=hp&ei=zZ_IY4mbC6S5oATl-Z2IAg&iflsig=AK50M_UAAAAAY8it3bMIAsEaqriLDuDTFQfCdXnYUDfK&ved=0ahUKEwjJtYLDwNL8AhWkHIgKHeV8ByEQ4dUDCAk&uact=5&oq=%EA%B5%AC%EA%B8%80%EA%B2%80%EC%83%89&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgcIIxDqAhAnOgQIIxAnOgsIABCABBCxAxCDAToRCC4QgAQQsQMQgwEQxwEQ0QM6CwguEIAEEMcBENEDOgQIABADOhAILhCxAxCDARDHARDRAxBDOgoIABCxAxCDARBDOggIABCABBCxA1C7AVjyCmDHC2gDcAB4AYABmAGIAZMKkgEEMC4xMJgBAKABAbABCg&sclient=gws-wiz"
    context("host를 전달하면") {
      val host = "https://shrt.at"
      it("shortURL을 반환한다") {
        val shortURL = ShortenURL.shortURL(host, targetURL)
        println(shortURL)
      }
    }
  }
})
