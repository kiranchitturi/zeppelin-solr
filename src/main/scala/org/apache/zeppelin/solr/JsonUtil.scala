package org.apache.zeppelin.solr

import org.json4s._

object JsonUtil {

  implicit class JValueExtended(value: JValue) {
    def has(childString: String): Boolean = {
      (value \ childString) != JNothing
    }
  }
}
