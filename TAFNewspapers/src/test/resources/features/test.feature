#Feature: API Tests
#  Scenario: GET request to /users
#    Given existing Server application
#    Then on GET request to /users it returns expected users list
#
#  Scenario: GET request to /new
#    Given existing Server application
#    Then on GET request to /new it returns expected welcome message
#
#  Scenario: GET request to /
#    Given existing Server application
#    Then on GET request to / it returns 301 and expected message
#
#  Scenario: GET request to nonexisting endpoint
#    Given existing Server application
#    Then on GET request to /nonexisting it returns 404 status code
#
#  Scenario Outline: POST request adds new user to users list
#    Given existing Server application
#    Then adding new user <name> with email <email> it returns expected response <response>
#
#    Examples:
#      | name      | email                 | response                                        |
#      | clark     | clark@codility.com    | clark with an email clark@codility.com added    |
#      | dan       |  dan@codility.com     | dan with an email dan@codility.com added        |
#      | admin     | codility@codility.com | admin with an email codility@codility.com added |
#      | incorrect | anna@codility.com     | User with this email already exists             |