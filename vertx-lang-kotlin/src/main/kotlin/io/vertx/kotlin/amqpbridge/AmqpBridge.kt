package io.vertx.kotlin.amqpbridge

import io.vertx.amqpbridge.AmqpBridge
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.amqpbridge.AmqpBridge.start]
 *
 * @param hostname the host name to connect to
 * @param port the port to connect to
 * @param username the username
 * @param password the password
 * @return [AmqpBridge]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqpbridge.AmqpBridge] using Vert.x codegen.
 */
suspend fun AmqpBridge.startAwait(hostname: String, port: Int, username: String, password: String): AmqpBridge {
  return awaitResult {
    this.start(hostname, port, username, password, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqpbridge.AmqpBridge.start]
 *
 * @param hostname the host name to connect to
 * @param port the port to connect to
 * @return [AmqpBridge]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqpbridge.AmqpBridge] using Vert.x codegen.
 */
suspend fun AmqpBridge.startAwait(hostname: String, port: Int): AmqpBridge {
  return awaitResult {
    this.start(hostname, port, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqpbridge.AmqpBridge.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqpbridge.AmqpBridge] using Vert.x codegen.
 */
suspend fun AmqpBridge.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

