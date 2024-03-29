import com.possible_triangle.gradle.features.publishing.UploadExtension

plugins {
    id("com.possible-triangle.gradle") version ("0.1.4")
}

subprojects {
    repositories {
        modrinthMaven()
        curseMaven()

        maven {
            url = uri("https://mvn.devos.one/snapshots/")
            content {
                includeGroup("com.tterrag.registrate_fabric")
                includeGroup("io.github.fabricators_of_create.Porting-Lib")
            }
        }

        maven {
            url = uri("https://maven.tterrag.com/")
            content {
                includeGroup("com.tterrag.registrate")
            }
        }

        maven {
            url = uri("https://maven.blamejared.com/")
            content {
                includeGroup("mezz.jei")
            }
        }

        maven {
            url = uri("https://jitpack.io")
            content {
                includeGroup("com.github.llamalad7.mixinextras")
            }
        }
    }

    tasks.withType<Jar> {
        exclude("**/*.bbmodel")
    }
}

enableSonarQube()