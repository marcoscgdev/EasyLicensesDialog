# [DEPRECATED] Easy Licenses Dialog  [![API](https://img.shields.io/badge/API-9%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=9) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Easy%20Licenses%20Dialog-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/3754)

## Library moved to: https://github.com/marcoscgdev/Licenser

An android library to display the licenses of your application libraries in a easy way.

---

## Releases:

#### Current release: 2.0.0.

You can see all the library releases [here](https://github.com/marcoscgdev/EasyLicensesDialog/releases).

---

## Demo:

You can download the **sample apk** [here](https://github.com/marcoscgdev/EasyLicensesDialog/blob/master/app-debug.apk?raw=true).

<img src="https://raw.githubusercontent.com/marcoscgdev/EasyLicensesDialog/master/device-2016-06-21-005826.gif" width="350">

---

## Usage:

There are two versions: the standard version and the AppCompat version (with Material Design).

#### Step: 1A - adding the library via Gradle

First of all add this to your root *build.gradle* file:

```
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

Now add the dependency to your app *build.gradle* file:

```
compile 'com.github.marcoscgdev:EasyLicensesDialog:2.0.0'
```

#### Step: 1B - adding the library via Jar file

Include [easylicensesdialog.jar](https://github.com/marcoscgdev/EasyLicensesDialog/tree/master/JAR) into your *libs* folder.

#### Step 2:
Edit the [licenses.html](https://github.com/marcoscgdev/EasyLicensesDialog/tree/master/app/src/main/assets) file and include it into your *assets* folder. Is **very important** that this file has the same name as here!

#### Step 3:
If you want to show the Easy Licenses Dialog, you can follow this snippet:

```java
new EasyLicensesDialogCompat(this)
                .setTitle("Licenses")
                .setPositiveButton(android.R.string.ok, null)
                .show();
```

---
>See the *sample project* to clarify any queries you may have.

---

## License

```
The MIT License (MIT)

Copyright (c) 2016 Marcos Calvo García

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
