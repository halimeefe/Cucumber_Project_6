


Feature: Login functionality

    Background:
    Given Navigate to parabank


   Scenario Outline: login that valid and  invalid  user information

      When enter valid username  as "<username>"and password  as "<password>"and click login button
      Then verify login success
      And click logoutlink
      When enter invalid username as"<invalidusername>"and password"<invalidpassword>" and click login button
      Then verify no login



      Examples:
        | username    | password |invalidusername| invalidpassword |
        |Samihan       |  665312 |  hjk          |125              |








