ATTENTION!
==========

This project will no longer be maintained. Moving forward, I am going to spend my time on development of this project here: https://github.com/dm77/barcodescanner

--------------------------------------------------------------------------------------

This is an Android library project that simplifies the usage of ZBar Android SDK (http://sourceforge.net/projects/zbar/files/AndroidSDK/) for scanning bar codes from within your Android application.

### How to use?

1. Download this project and add it as a library project to your existing Android app.
2. Open the AndroidManifest.xml file in your project and add these lines under the manifest element:
<pre>
&lt;uses-permission android:name="android.permission.CAMERA"/&gt;
&lt;uses-feature android:name="android.hardware.camera" /&gt;
</pre>
3. Within the application element, add the activity declaration:
<pre>
&lt;activity android:name="com.dm.zbar.android.scanner.ZBarScannerActivity"
            android:screenOrientation="landscape"
            android:label="@string/app_name" /&gt;
</pre>
4. Now from inside your Android application, you can launch the ZBarScanner from any activity using this intent:

```java
Intent intent = new Intent(this, ZBarScannerActivity.class);
startActivityForResult(intent, ZBAR_SCANNER_REQUEST);
```

To receive the results of the SCAN, add this method to your activity:

```java
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data)
{    
    if (resultCode == RESULT_OK) 
    {
        // Scan result is available by making a call to data.getStringExtra(ZBarConstants.SCAN_RESULT)
        // Type of the scan result is available by making a call to data.getStringExtra(ZBarConstants.SCAN_RESULT_TYPE)
        Toast.makeText(this, "Scan Result = " + data.getStringExtra(ZBarConstants.SCAN_RESULT), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Scan Result Type = " + data.getIntExtra(ZBarConstants.SCAN_RESULT_TYPE, 0), Toast.LENGTH_SHORT).show();
        // The value of type indicates one of the symbols listed in Advanced Options below.
    } else if(resultCode == RESULT_CANCELED) {
        Toast.makeText(this, "Camera unavailable", Toast.LENGTH_SHORT).show();
    }
}
```  

### Advanced Options
If you are interested in scanning only QR codes, you can specify the SCAN mode in the intent as shown below:
```java
Intent intent = new Intent(this, ZBarScannerActivity.class);
intent.putExtra(ZBarConstants.SCAN_MODES, new int[]{Symbol.QRCODE});
startActivityForResult(intent, ZBAR_SCANNER_REQUEST);
```

You can pass an array or integers for SCAN_MODES. The exact values are specified in net.sourceforge.zbar.Symbol class:
```java
public static final int NONE = 0;
public static final int PARTIAL = 1;
public static final int EAN8 = 8;
public static final int UPCE = 9;
public static final int ISBN10 = 10;
public static final int UPCA = 12;
public static final int EAN13 = 13;
public static final int ISBN13 = 14;
public static final int I25 = 25;
public static final int DATABAR = 34;
public static final int DATABAR_EXP = 35;
public static final int CODABAR = 38;
public static final int CODE39 = 39;
public static final int PDF417 = 57;
public static final int QRCODE = 64;
public static final int CODE93 = 93;
public static final int CODE128 = 128;
```

If you do not specify scan_modes, the scanner processes all the above listed types.

But if you are interested in QRCodes and ISBN, you would setup the intent as follows:
```java
Intent intent = new Intent(this, ZBarScannerActivity.class);
intent.putExtra(ZBarConstants.SCAN_MODES, new int[]{Symbol.QRCODE, Symbol.ISBN10, Symbol.ISBN13});
startActivityForResult(intent, ZBAR_SCANNER_REQUEST);
```

### Example app
There is a ZBarScannerDemo app in the examples folder which demonstrates the use of this library.

### Tests
I have tested the scanner functionality on these devices without any issues so far:
* Motorola Droid running Android 2.2.3
* HTC Thunderbolt running Android 2.3.4
* Samsung Galaxy Nexus running Android 4.0.4

###Credits
Almost all of the code for this library project has been taken from these two places:

1. CameraPreview app from Android SDK APIDemos 
2. The ZBar Android SDK: http://sourceforge.net/projects/zbar/files/AndroidSDK/

###License
MIT

--------------------------------------------------------------------------------------

ATTENTION!
==========

This project will no longer be maintained. Moving forward, I am going to spend my time on development of this project here: https://github.com/dm77/barcodescanner
