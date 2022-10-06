#Autor Nicolas De La Cruz 3-731-766 10-5-2022

Feature: Sign up page
  As a user, I want to create a new account to become a member of uTest.
  @scenario1
  Scenario: Access to the sign up form page from the main page
    Given the user are at uTest home page
    When  clicks on the Join Today button
    Then  user get redirected to the sign up form and fill form