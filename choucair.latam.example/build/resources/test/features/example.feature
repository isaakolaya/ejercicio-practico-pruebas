#Autor: Isaak Olaya

@HU001
Feature: Latam
  As a user, I want to search and buy flights on the website

  @Test1
  Scenario Outline: Search and buy flights
    Given Isaak wants to visit the Latam website
    When Select the Use LATAM Pass Miles checkbox to then enter the origin and destination plus the departure date and the return date of the flight and click the Search button
      | origin   | destination   |
      | <origin> | <destination> |
    Then he validates the flights

    Examples:
      | origin   | destination |
      | Medellin | San Andres  |

  @Test2
  Scenario Outline: opencart
    Given Isaak wants to visit the opencart website
    And he log in to the opencart website
      | userN   | passW   |
      | <userN> | <passW> |
    When he goes to the reporting area to review the tax report
    Then he validates report

    Examples:
      | userN | passW |
      | demo  | demo  |

  @Test3
  Scenario Outline: opencart
    Given Isaak wants to visit the opencart website
    And he log in to the opencart website
      | userN   | passW   |
      | <userN> | <passW> |
    When he clicks to the catalog and clicks to the products section
    And he makes a filter to search for a product
      | productName   | model   | price   | quantity   |
      | <productName> | <model> | <price> | <quantity> |
    Then he validates the product
    Examples:
      | userN | passW | productName | model      | price | quantity |
      | demo  | demo  | HP LP3065   | Product 21 | 100   | 1000     |




