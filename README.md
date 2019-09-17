# TriangleGen

##Environment Setup
1. File -> Sync Project With Gradle Files
2. Build -> Make Project
3. You need a device (virtual or hardware) to run anything in this project
4. Tools -> AVD Manager ->create virutal device.
5. Choose any image (James Webb is using a Pixel 2 API 25)
6. If on AMD you MUST pick a system image with an ABI or either armeabi-v7a, or arm64-v8a under the Other Images tab
7. Don’t worry about the Your CPU does not support required features.  Your emulator will run slower than it would with intel but it will still run

##Running Unit tests
1. Build Project
2. In file explorer (left hand side of IDE) Android/app/java
3. Right click and select run to run a file (MainActivity, or MainActivityTest) (this will not work if you don't have an emulator setup - See Environment Setup)
4. If running a unit test file still does not cause your test to run you can try: File -> Invalidate Caches/Restart
