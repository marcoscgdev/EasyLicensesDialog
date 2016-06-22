# Easy Licenses Dialog  [![API](https://img.shields.io/badge/API-9%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=11)

An android library to display the licenses of your application libraries in a easy way.

---

##Demo:

You can download the **sample apk** [here](https://github.com/marcoscgdev/EasyLicensesDialog/raw/master/sample/app-debug.apk).

![demo gif](https://raw.githubusercontent.com/marcoscgdev/EasyLicensesDialog/master/sample/device-2016-06-21-005826.gif)

---

## Usage:

There are two versions: the standard version and the AppCompat version (with Material Design).

####Step: 1
Include your prefered version of [easylicensesdialog.jar](https://github.com/marcoscgdev/EasyLicensesDialog/blob/master/library) into your _libs_ folder ***(Only one!!!)***.

####Step 2:
Edit the [licenses.html](https://github.com/marcoscgdev/EasyLicensesDialog/tree/master/html%20file) file and include it into your _assets_ folder. Is **very important** that this file has the same name as here!

####Step 3:
If you want to show the Easy Licenses Dialog, you can follow this snippet:

```java
EasyLicensesDialog easyLicensesDialog = new EasyLicensesDialog(this);
        easyLicensesDialog.setTitle("Licenses"); //by default EasyLicensesDialog comes without any title.
        easyLicensesDialog.setCancelable(true); //true or false
        //easyLicensesDialog.setIcon(R.mipmap.ic_launcher); //add an icon to the title
        easyLicensesDialog.show(); //show the dialog
```

---
>See the [sample project](https://github.com/marcoscgdev/EasyLicensesDialog/tree/master/sample) to clarify any queries you may have.

---

##License

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
SOFTWARE.```
