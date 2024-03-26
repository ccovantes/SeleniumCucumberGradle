Feature: Feature name
    Feature Description 

@Test01
Scenario: I can access to liverpool and find playstation
    Given I navigate to liverpool page
    When I search the products "playstation"
    Then Validate that playstation 5 and consola is displayed
    Then I select a playstation 5 in the result listened
    And I validate the title of the item displayed
    And I validate the price of the item displayed

@Test02
Scenario: I can access to liverpool and find smart tv
    Given I navigate to liverpool page
    When I search the products "smart tv"
    Then Validate that "price" is displayed
    Then I filter the result by 55 inches
    Then I filter the result by price greater than 10000
    Then I filter the result by brand sony
    And I validate the result count

@Test03
Scenario: I can access a dior products by categorias menu
    Given I navigate to liverpool page
    When I select categorias menu
    Then I select belleza
    Then I select perfumes de hombre
    And I select by dior brand filter

    