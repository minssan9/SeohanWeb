package com.seohan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.PropertySource
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.bind.annotation.CrossOrigin

@SpringBootApplication
@EnableScheduling
//@Configuration
@PropertySource(value = ["classpath:account.properties"])
@CrossOrigin(origins = ["http://localhost:8091", "http://localhost:8090", "http://localhost"])
open class SeohanWebApplication : SpringBootServletInitializer() {

    override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
        return builder.sources(SeohanWebApplication::class.java!!)
    }
    fun main(args: Array<String>) {
        runApplication<SeohanWebApplication>(*args)
    }
}
