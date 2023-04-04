

  Feature: Biil Pay Functionality

    Background:
      Given Navigate to parabank

    Scenario Outline: pay three bills on BillPay page
      When enter valid username  as "<username>"and password  as "<password>"and click login button
      When click the BillPay link
      And  pay  the bills "<amount>"
      Then verify that bills have been  paid


      Examples:
        |username   |password|amount|
        |Samihan     |665312   |85    |
        |Samihan     |665312   |45    |
        |Samihan     |665312   |120   |
