Feature: MyCareerApp
  
  Scenario: 1 Home and CareerLattice
    Given User Navigated to OneC Website  
    And ScrollDown to HotApps
    When User Clicking MyCareer App
    Given Switch Frame
    And Clicking on Arrow
    When Switching the Frame
    And Displaying the Service Line
    And Switching to main frame
    And Click Mycareer icon
     
    
  Scenario: 2  UploadResumeorLinkedinProfile and SkillProfile
    Given User Navigating to Cognizant My Skills
    And Handling Window
    When Clicking MySkills
    And Click on Technical
    And Get list of technical Skills
    Then Click on Domain
    And Get list of domain skills
    Then Click on Functional
    And Get list of functional skills
    Then Click on Behavioral 
    And Get list of behavioral skills 
    Given User Clicks on My skill path
    And click on Org Assigned
    When Scroll down to CTS
    And clicking arrow
    And Select skilling path
    And Displaying the Cluster skills
    
    
  Scenario: 3  SkillUp  
    Given User navigate to OneCognizant Apps
    And Switching frame in skillup
    When Scrolling for view
    And AquireSkills using get text to display
    
 
