package eu.roodbaard.azureservicebus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class AzureServiceBusApp

fun main(args: Array<String>) {
    runApplication<AzureServiceBusApp>(*args)
}

