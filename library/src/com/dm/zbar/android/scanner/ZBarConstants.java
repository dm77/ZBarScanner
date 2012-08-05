package com.dm.zbar.android.scanner;

public interface ZBarConstants {
    public static final String SCAN_MODES = "SCAN_MODES";
    public static final String SCAN_RESULT = "SCAN_RESULT";
    public static final String SCAN_RESULT_TYPE = "SCAN_RESULT_TYPE";

    // NOTE: Constants directly copied from net.sourceforge.zbar.Symbol
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
}
