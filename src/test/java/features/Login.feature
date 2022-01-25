Feature: Application Login

Scenario: Home Page default login
 Given User is on NetBanking page
 When User login into application with "jin" and "12345"
 Then Home page is populated
 And Cards displayed are "true"

Scenario: Home Page default login
 Given User is on NetBanking page
 When User login into application with "john" and "12345"
 Then Home page is populated
 And Cards displayed are "false"

