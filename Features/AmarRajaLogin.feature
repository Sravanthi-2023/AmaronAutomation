Feature: AmarRaja
@TS_signin
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and 
   "<RowNumber>"
    Given User Launch Chrome browser
    When User opens URL
    And Clicks on LoginButton
    When The user enter sheet "<Sheetname>" and "<RowNumber>"
   
    Examples: 
      | Sheetname | RowNumber |

      | Sheet1    |         0 |
      
      | Sheet1    |         1 |
      
      | Sheet1    |         2 |

      


      