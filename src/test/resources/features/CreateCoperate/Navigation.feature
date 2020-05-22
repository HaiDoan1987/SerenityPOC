Feature: Navigation

    @SmokeTest
    Scenario: Verify that user can navigate some pages when clicking on Main and Sub menu of Left Menu
      Given Hai login to application successfully
      Then he could navigate to following pages by clicking
        | Menu / Submenu    | Desired Url                                                                                               | Page Header        |
        | Marketplace       | https://pycotest.tradeteq.com/deals                                                                       | Marketplace        |
        | Create deal       | https://pycotest.tradeteq.com/deals/create                                                                | Create a deal      |
        | Operations        | https://pycotest.tradeteq.com/operations/88c40ac6-1136-4e8f-94fb-a1aee76b3910/corporate/corporates-banks  | Corporates / Banks |
        | Import corporates | https://pycotest.tradeteq.com/operations/88c40ac6-1136-4e8f-94fb-a1aee76b3910/corporate/import-corporates | Import corporates  |

  @SmokeTest
  Scenario: Verify that user can navigate some pages when hovering and clicking on Main and Sub menu of Left Menu
    Given Hai login to application successfully
    Then he could navigate to following pages by hovering and clicking
      | Menu       | Submenu                  | Desired Url                                      | Page Header                                 |
      | Trade      | Manage letters of credit | https://pycotest.tradeteq.com/letters-of-credit  | Letters of Credit - Participation Agreement |
      | My Company | Automation POC profile   | https://pycotest.tradeteq.com/company/my-company | Automation POC                              |


