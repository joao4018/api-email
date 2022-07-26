package test.api.email.email

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class EmailApplication

fun main(args: Array<String>) {
	runApplication<EmailApplication>(*args)
}
