package com.pedro.rtmp.rtmp.message

import java.io.InputStream

/**
 * Created by pedro on 21/04/21.
 */
class Abort(header: RtmpHeader = RtmpHeader()): RtmpMessage(header) {
  override fun readBody(input: InputStream) {
    TODO("Not yet implemented")
  }

  override fun storeBody(): ByteArray {
    TODO("Not yet implemented")
  }

  override fun getType(): MessageType {
    TODO("Not yet implemented")
  }

  override fun getSize(): Int {
    TODO("Not yet implemented")
  }
}