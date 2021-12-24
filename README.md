# OctoEconomyApi
Economy API for Fabric


Currently I have no maven so to make use of this API you will need to clone the repo, build it locally and then 

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


# Economy Implementations

EightsEconomyP - Thonk


# Content mods making use of this API

Shoppy - Thonk
