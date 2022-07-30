# OctoEconomyApi
Economy API for Fabric

There are two options to make use of this API in your project, jitpack or clone and build locally.

### Jitpack

```
repositories {
  maven { url = "https://jitpack.io" }
}
```

in your build.gradle and you can include the API with

```
modApi "com.github.ExcessiveAmountsOfZombies:OctoEconomyApi:5137175b1c"
include "com.github.ExcessiveAmountsOfZombies:OctoEconomyApi:5137175b1c"
```

`5137175b1c` corresponds to version 1.0.0 of the API

### Local

`./gradlew publishToMavenLocal`

After that make sure you have 

```
repositories {
  mavenLocal()
}
```

in your build.gradle and you can include the API with

```
modApi "com.epherical.octo-economy-api:OctoEconomyApi:1.0.0"
include "com.epherical.octo-economy-api:OctoEconomyApi:1.0.0"
```

Just-In-Jar might not always be necessary.


If you want your mod added to this list here, submit a PR!

# Economy Implementations

[EightsEconomyP](https://www.curseforge.com/minecraft/mc-mods/eightseconomyp) - Thonk


# Content mods making use of this API

[Shoppy](https://www.curseforge.com/minecraft/mc-mods/shoppy) - Thonk

[The Guild](https://www.curseforge.com/minecraft/mc-mods/guild) - fulmineo64

[Flan](https://www.curseforge.com/minecraft/mc-mods/flan) - Flemmli97
