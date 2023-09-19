Feature: MyFeature

  Background:
    * def MyFeature = Java.type('examples.myfeature.MyFeature')
    * def feature = new MyFeature()

  @TEST-LOCAL
  Scenario: MyScenario
    Given def x = "Alberto"
    When feature.send(x)
    Then def result = feature.getExpectedResult()
    And karate.log('result', result)
    And assert feature.assertResult1(result)
    And assert feature.assertResult2(result)
