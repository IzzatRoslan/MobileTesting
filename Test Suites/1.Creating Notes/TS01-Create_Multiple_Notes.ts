<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS01-Create_Multiple_Notes</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>86ea1524-8bed-4128-b021-785c37e90a26</testSuiteGuid>
   <testCaseLink>
      <guid>a1c58e26-92c3-4f8d-be06-03f08ed5ad98</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/1.Creating Note/Open Application</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>229ae7a3-e4a5-4530-9c8a-935b1ff061df</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/1.Creating Note/Create Notes</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d5bf3ecf-c0ec-4013-8cae-ddb1d33e518d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Note Data</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>d5bf3ecf-c0ec-4013-8cae-ddb1d33e518d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>notes</value>
         <variableId>21e58e38-79b6-491f-92e7-d95965fc9f84</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
