# Steve Saga

A mod specifically made to make blocks and items from [FavreMySabre's Steve Saga series](<https://www.youtube.com/playlist?list=PL5jr0ZJTfioi2Zag3FT6QFhECcceBnNEE>) into blocks and items of their own, thus not needing a texture pack.

# How to build this mod using Gradle?

 1. Install [Gradle v4.9](<https://gradle.org/next-steps/?version=4.9&format=bin>)
 2. Create a new folder in C:/ called Gradle (C:/Gradle)
 3. Drop the gradle-4.9 folder into C:/Gradle
 4. In the Windows search bar, search for `Environment Variables`
 5. Open `Edit the system environment variables`
 6. In the bottom right corner, click `Environment Variables`
 7. Under `System Variables` find `Path` and double-click on it
 8. In the top right corner click `New`
 9. In the new empty row, write `C:\Gradle\gradle-4.9\bin`

### Great! Now you've installed Gradle

To finally build this mod, open a Terminal in the repository's root and write `./gradlew build`.
After you've done that, in `/build/libs/` there will be a file named `modid-1.0.jar`, you drop that into your mods folder.

# You don't want to build the mod yourself?

That's fine! In the repository, you can navigate to `/build/libs/`, find `modid-1.0.jar`, download it and finally put it in your mods folder.