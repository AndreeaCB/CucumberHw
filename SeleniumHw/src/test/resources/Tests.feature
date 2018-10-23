Feature:
  Scenario: Adding a new pet type
    Given I go on the petclinic site on the Pet Type Tab
    When I click on the Add Button AND I complete the Name field as "TestPet"
    Then I click on the Save Button

    Scenario: Adding a new vet
      Given I go on the petclinic site on the Add Veterinarian Tab
      When I complete the firstName field as "First Name Vet Cucumber" AND lastName field as "Last Name Vet Cucumber" AND click on the Type Dropdpwn AND select a value from Dropdown
      Then I click on the SaveVet Button

