# [IDEA-360831]

[IDEA-360831]: https://youtrack.jetbrains.com/issue/IDEA-360831

The problem: Intellij can't debug code from named "included" Gradle build.
Breakpoints don't work.

## How to reproduce

1. Clone this repo: `git clone ...`
2. Open just cloned repo with Intellij: `idea cloned-repo`
3. Right-click `example-app/settings.gradle.kts` and choose "Link Gradle Project"
4. Open `libs/some-java-lib-project/src/main/java/com/example/libs/MathUtils.java` and 
set a breakpoint inside of `add` method
5. Open `libs/some-java-lib-project/src/test/java/com/example/libs/MathUtilsTest.java` and
run the test in debug mode. The breakpoint will be ignored 😱

## Workaround option 1

1. Open `libs/settings.gradle.kts` and comment out the `rootProject.name`
2. Run the test again and Intellij will stop at the breakpoint as expected!👍

## Workaround option 2

1. Unlink `example-app` Gradle project from Intellij
2. Do "Link Gradle Project" on `libs/settings.gradle.kts` directly
3. Run the test in debug mode and Intellij will stop at the breakpoint as expected!👍
