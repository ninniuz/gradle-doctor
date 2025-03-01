pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

plugins {
  id("com.gradle.enterprise") version "3.15.1"
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    publishAlways()
  }
}

include("simple")
include("dagger-kapt")

includeBuild("doctor-plugin")

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}
