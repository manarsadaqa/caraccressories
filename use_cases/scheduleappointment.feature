Feature: Schedule Appointment

Scenario: Add a appointment when the installer is logged in
Given Given the installer is already logged in with email 'ali@gmail.com' and password 'ali'
When  I try to add a appointmant with installername "ali" and installeremail 'ali@gmail.com' and installerday 'Sunday' and installermonth '14-April' and installerhour 5
Then I will add the installer appointment with email 'ali@gmail.com'
