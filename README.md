# ActivityLifeCyle 
This project have lifecyle of Actvity when communicating between with the two Activity
first Activity is MainActivity
and second activity is Main2Activity

Documetation of the Activity Lifecyle is 
https://developer.android.com/guide/components/activities/activity-lifecycle

While navigating between activity 
https://developer.android.com/guide/components/activities/activity-lifecycle#tba

Actvity lifecyle with the dialog
https://developer.android.com/guide/components/activities/state-changes#covered

Activity lifecyle while configuration chages 
https://developer.android.com/guide/components/activities/state-changes#cco



Activity's onpause method not getting called after showing AlertDialog
onPause() is called when your activity is no longer at the top of the activity stack. A Dialog by itself is not an Activity, so will not replace the current Activity at the top of the stack, so will not cause anything to pause.

A dialog (lower-case) does not need to be implemented by a Dialog class, however. For example, it is not uncommon to implement one with an Activity whose theme is set to that of a dialog. In this case, displaying the dialog-as-an-Activity will cause the new Activity to be on the top of the stack, pausing what previously was there
