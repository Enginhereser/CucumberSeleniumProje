Feature: signup
  @test
  Scenario: scenario new account

    Given user on "https://automationexercise.com/"
    When  user click Login Sign button
    And   Verify 'New User Signup!' is visible
    And   Enter name and email address
    And   Click 'Signup' button
    Then  Verify that 'Enter Account Information' is visible
    And   Fill details: Title, Name, Email, Password, Date of birth
    And   Select checkbox 'Sign up for our newsletter!'
    And   Select checkbox 'Receive special offers from our partners!'
    And   Fill details: First name, Last name, Company, Address, Address, Country, State, City, Zipcode, Mobile Number
    And   Click 'Create Account' button
    Then  Verify that 'Account Created!' is visible
    And   Click Continue button
    And   Verify that Logged in as username is visible
    And   Click Delete Account button






