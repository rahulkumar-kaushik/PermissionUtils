# PermissionUtils
Android library for run-time permissions. Simply call this utils it will check run-time permissions granted or not.

This is a simple android library for run-time app permission. Instead of writing run-time permission code use this library in your project.

Just need to access a function in code whenever you need this code in your class.

Simply call a boolean funtion:- 

checkPermissions(Activity name,int[] integerArray)

This function tell you permission granted or not.

Pass value of permissions whatever you need:

1.READ_CALENDAR,
2.WRITE_CALENDAR,
3.READ_CALL_LOG,
4.WRITE_CALL_LOG,
5.PROCESS_OUTGOING_CALLS,
6.CAMERA,
7.READ_CONTACTS,
8.WRITE_CONTACTS,
9.GET_ACCOUNTS,
10.ACCESS_FINE_LOCATION,
11.ACCESS_COARSE_LOCATION,
12.RECORD_AUDIO,
13.READ_PHONE_STATE,
14.READ_PHONE_NUMBERS,
15.CALL_PHONE,
16.ANSWER_PHONE_CALLS,
17.ADD_VOICEMAIL,
18.USE_SIP,
19.BODY_SENSORS,
20.SEND_SMS,
21.RECEIVE_SMS,
22.READ_SMS,
23.RECEIVE_WAP_PUSH,
24.RECEIVE_MMS,
25.READ_EXTERNAL_STORAGE,
26.WRITE_EXTERNAL_STORAGE


For example:-

In Kotlin:-
checkPermissions(this,intArrayOf(2,4,6,11))

In Java:-
checkPermissions(this,new int[]{1,5,9});

Sample code:-
MainActivity.class

All the permission work will be done by this utility.

Use this and make your code more robust,reliable,simple and easy to understandable.

Thank you.
