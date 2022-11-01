Feature: Creating Notes Features
Scenario Outline: This is Test Create Notes


Given User open the application
When  User tap the skip button
And   User tap on the + Icon
And   User select note option
And   User enters fill in their notes <notes>
And   User tap on the tick button to save the note
And   User tap on back button
Then  User verify their notes in the homepage <notes>

Examples:

|notes|
|This is for testing purposes |