# DataStorage
An assignment for CS 246 Software Design and Development

OVERVIEW
For this activity, we will explore some options for storing data in an Android application. To demonstrate this, we will be storing a count of the number of times a user has clicked a button. You are required to implement this functionality using SharedPreferences, and have the opportunity to also do it using a SQLite database for extra credit. If you will be using SQLite in your project, I would strongly recommend completing the extra at this point to get you started.

INSTRUCTIONS
Part I - A simple counter

Create a new, blank Android project.
Create a new activity that has two buttons labeled: "Save Count" and "Advance", and a single text box.
When the activity starts, have it put the number "0" in the text box.
Make the "Advance" button increment the number in the text box by one.
Part II - Data storage

Make the "Save Count" button save the count to the user's SharedPreferences.
Change the activity so that when it loads, it tries to load the saved value from the SharedPreferences. If no value can be found, it should put "0" in the box.
Verify that your saving works by doing the following:
Advance to "4"
Click "Save Count"
Advance to "5"
Close the application, and restart it. The number in the box should be 4.
