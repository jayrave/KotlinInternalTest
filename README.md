"kotlin-android" gradle plugin (v1.0.0) issue
---------------------------------------------

Unable to access internal classes from test code within the same module when using **product_flavors**

Without any product_flavors, tests in "app" module run without any issues. When "prod" product_flavor gets introduced, compilation fails with the following message

> Error:(9, 9) Cannot access 'InternalClass': it is 'internal' in 'kotlininternaltest'
> Error:Execution failed for task ':app:compileProdDebugUnitTestKotlin'.

YouTrack link: https://youtrack.jetbrains.com/issue/KT-11166
