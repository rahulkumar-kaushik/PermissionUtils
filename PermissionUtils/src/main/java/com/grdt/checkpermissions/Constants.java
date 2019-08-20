package com.grdt.checkpermissions;

import static android.Manifest.permission.*;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class Constants {
    public static String[] PERMISSIONS = {
            READ_CALENDAR,
            WRITE_CALENDAR,
            READ_CALL_LOG,
            WRITE_CALL_LOG,
            PROCESS_OUTGOING_CALLS,
            CAMERA,
            READ_CONTACTS,
            WRITE_CONTACTS,
            GET_ACCOUNTS,
            ACCESS_FINE_LOCATION,
            ACCESS_COARSE_LOCATION,
            RECORD_AUDIO,
            READ_PHONE_STATE,
            READ_PHONE_NUMBERS,
            CALL_PHONE,
            ANSWER_PHONE_CALLS,
            ADD_VOICEMAIL,
            USE_SIP,
            BODY_SENSORS,
            SEND_SMS,
            RECEIVE_SMS,
            READ_SMS,
            RECEIVE_WAP_PUSH,
            RECEIVE_MMS,
            READ_EXTERNAL_STORAGE,
            WRITE_EXTERNAL_STORAGE
    };
}
