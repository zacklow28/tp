---
  layout: default.md
  title: "Developer Guide"
  pageNav: 3
---

# AB-3 Developer Guide

<!-- * Table of Contents -->
<page-nav-print />

--------------------------------------------------------------------------------------------------------------------

## **Acknowledgements**

_{ list here sources of all reused/adapted ideas, code, documentation, and third-party libraries -- include links to the original source as well }_

--------------------------------------------------------------------------------------------------------------------

## **Setting up, getting started**

Refer to the guide [_Setting up and getting started_](SettingUp.md).

--------------------------------------------------------------------------------------------------------------------

## **Design**

### Architecture

<puml src="diagrams/ArchitectureDiagram.puml" width="280" />

The ***Architecture Diagram*** given above explains the high-level design of the App.

Given below is a quick overview of main components and how they interact with each other.

**Main components of the architecture**

**`Main`** (consisting of classes [`Main`](https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/Main.java) and [`MainApp`](https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/MainApp.java)) is in charge of the app launch and shut down.
* At app launch, it initializes the other components in the correct sequence, and connects them up with each other.
* At shut down, it shuts down the other components and invokes cleanup methods where necessary.

The bulk of the app's work is done by the following four components:

* [**`UI`**](#ui-component): The UI of the App.
* [**`Logic`**](#logic-component): The command executor.
* [**`Model`**](#model-component): Holds the data of the App in memory.
* [**`Storage`**](#storage-component): Reads data from, and writes data to, the hard disk.

[**`Commons`**](#common-classes) represents a collection of classes used by multiple other components.

**How the architecture components interact with each other**

The *Sequence Diagram* below shows how the components interact with each other for the scenario where the user issues the command `delete 1`.

<puml src="diagrams/ArchitectureSequenceDiagram.puml" width="574" />

Each of the four main components (also shown in the diagram above),

* defines its *API* in an `interface` with the same name as the Component.
* implements its functionality using a concrete `{Component Name}Manager` class (which follows the corresponding API `interface` mentioned in the previous point.

For example, the `Logic` component defines its API in the `Logic.java` interface and implements its functionality using the `LogicManager.java` class which follows the `Logic` interface. Other components interact with a given component through its interface rather than the concrete class (reason: to prevent outside component's being coupled to the implementation of a component), as illustrated in the (partial) class diagram below.

<puml src="diagrams/ComponentManagers.puml" width="300" />

The sections below give more details of each component.

### UI component

The **API** of this component is specified in [`Ui.java`](https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/ui/Ui.java)

<puml src="diagrams/UiClassDiagram.puml" alt="Structure of the UI Component"/>

The UI consists of a `MainWindow` that is made up of parts e.g.`CommandBox`, `ResultDisplay`, `PersonListPanel`, `StatusBarFooter` etc. All these, including the `MainWindow`, inherit from the abstract `UiPart` class which captures the commonalities between classes that represent parts of the visible GUI.

The `UI` component uses the JavaFx UI framework. The layout of these UI parts are defined in matching `.fxml` files that are in the `src/main/resources/view` folder. For example, the layout of the [`MainWindow`](https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/ui/MainWindow.java) is specified in [`MainWindow.fxml`](https://github.com/se-edu/addressbook-level3/tree/master/src/main/resources/view/MainWindow.fxml)

The `UI` component,

* executes user commands using the `Logic` component.
* listens for changes to `Model` data so that the UI can be updated with the modified data.
* keeps a reference to the `Logic` component, because the `UI` relies on the `Logic` to execute commands.
* depends on some classes in the `Model` component, as it displays `Person` object residing in the `Model`.

### Logic component

**API** : [`Logic.java`](https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/logic/Logic.java)

Here's a (partial) class diagram of the `Logic` component:

<puml src="diagrams/LogicClassDiagram.puml" width="550"/>

The sequence diagram below illustrates the interactions within the `Logic` component, taking `execute("delete 1")` API call as an example.

<puml src="diagrams/DeleteSequenceDiagram.puml" alt="Interactions Inside the Logic Component for the `delete 1` Command" />

<box type="info" seamless>

**Note:** The lifeline for `DeleteCommandParser` should end at the destroy marker (X) but due to a limitation of PlantUML, the lifeline continues till the end of diagram.
</box>

How the `Logic` component works:

1. When `Logic` is called upon to execute a command, it is passed to an `AddressBookParser` object which in turn creates a parser that matches the command (e.g., `DeleteCommandParser`) and uses it to parse the command.
1. This results in a `Command` object (more precisely, an object of one of its subclasses e.g., `DeleteCommand`) which is executed by the `LogicManager`.
1. The command can communicate with the `Model` when it is executed (e.g. to delete a person).<br>
   Note that although this is shown as a single step in the diagram above (for simplicity), in the code it can take several interactions (between the command object and the `Model`) to achieve.
1. The result of the command execution is encapsulated as a `CommandResult` object which is returned back from `Logic`.

Here are the other classes in `Logic` (omitted from the class diagram above) that are used for parsing a user command:

<puml src="diagrams/ParserClasses.puml" width="600"/>

How the parsing works:
* When called upon to parse a user command, the `AddressBookParser` class creates an `XYZCommandParser` (`XYZ` is a placeholder for the specific command name e.g., `AddCommandParser`) which uses the other classes shown above to parse the user command and create a `XYZCommand` object (e.g., `AddCommand`) which the `AddressBookParser` returns back as a `Command` object.
* All `XYZCommandParser` classes (e.g., `AddCommandParser`, `DeleteCommandParser`, ...) inherit from the `Parser` interface so that they can be treated similarly where possible e.g, during testing.

### Model component
**API** : [`Model.java`](https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/model/Model.java)

<puml src="diagrams/ModelClassDiagram.puml" width="450" />


The `Model` component,

* stores the address book data i.e., all `Person` objects (which are contained in a `UniquePersonList` object).
* stores the currently 'selected' `Person` objects (e.g., results of a search query) as a separate _filtered_ list which is exposed to outsiders as an unmodifiable `ObservableList<Person>` that can be 'observed' e.g. the UI can be bound to this list so that the UI automatically updates when the data in the list change.
* stores a `UserPref` object that represents the user’s preferences. This is exposed to the outside as a `ReadOnlyUserPref` objects.
* does not depend on any of the other three components (as the `Model` represents data entities of the domain, they should make sense on their own without depending on other components)

<box type="info" seamless>

**Note:** An alternative (arguably, a more OOP) model is given below. It has a `Tag` list in the `AddressBook`, which `Person` references. This allows `AddressBook` to only require one `Tag` object per unique tag, instead of each `Person` needing their own `Tag` objects.<br>

<puml src="diagrams/BetterModelClassDiagram.puml" width="450" />

</box>


### Storage component

**API** : [`Storage.java`](https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/storage/Storage.java)

<puml src="diagrams/StorageClassDiagram.puml" width="550" />

The `Storage` component,
* can save both address book data and user preference data in JSON format, and read them back into corresponding objects.
* inherits from both `AddressBookStorage` and `UserPrefStorage`, which means it can be treated as either one (if only the functionality of only one is needed).
* depends on some classes in the `Model` component (because the `Storage` component's job is to save/retrieve objects that belong to the `Model`)

### Common classes

Classes used by multiple components are in the `seedu.address.commons` package.

--------------------------------------------------------------------------------------------------------------------

## **Implementation**

This section describes some noteworthy details on how certain features are implemented.

### \[Proposed\] Undo/redo feature

#### Proposed Implementation

The proposed undo/redo mechanism is facilitated by `VersionedAddressBook`. It extends `AddressBook` with an undo/redo history, stored internally as an `addressBookStateList` and `currentStatePointer`. Additionally, it implements the following operations:

* `VersionedAddressBook#commit()` — Saves the current address book state in its history.
* `VersionedAddressBook#undo()` — Restores the previous address book state from its history.
* `VersionedAddressBook#redo()` — Restores a previously undone address book state from its history.

These operations are exposed in the `Model` interface as `Model#commitAddressBook()`, `Model#undoAddressBook()` and `Model#redoAddressBook()` respectively.

Given below is an example usage scenario and how the undo/redo mechanism behaves at each step.

Step 1. The user launches the application for the first time. The `VersionedAddressBook` will be initialized with the initial address book state, and the `currentStatePointer` pointing to that single address book state.

<puml src="diagrams/UndoRedoState0.puml" alt="UndoRedoState0" />

Step 2. The user executes `delete 5` command to delete the 5th person in the address book. The `delete` command calls `Model#commitAddressBook()`, causing the modified state of the address book after the `delete 5` command executes to be saved in the `addressBookStateList`, and the `currentStatePointer` is shifted to the newly inserted address book state.

<puml src="diagrams/UndoRedoState1.puml" alt="UndoRedoState1" />

Step 3. The user executes `add n/David …​` to add a new person. The `add` command also calls `Model#commitAddressBook()`, causing another modified address book state to be saved into the `addressBookStateList`.

<puml src="diagrams/UndoRedoState2.puml" alt="UndoRedoState2" />

<box type="info" seamless>

**Note:** If a command fails its execution, it will not call `Model#commitAddressBook()`, so the address book state will not be saved into the `addressBookStateList`.

</box>

Step 4. The user now decides that adding the person was a mistake, and decides to undo that action by executing the `undo` command. The `undo` command will call `Model#undoAddressBook()`, which will shift the `currentStatePointer` once to the left, pointing it to the previous address book state, and restores the address book to that state.

<puml src="diagrams/UndoRedoState3.puml" alt="UndoRedoState3" />


<box type="info" seamless>

**Note:** If the `currentStatePointer` is at index 0, pointing to the initial AddressBook state, then there are no previous AddressBook states to restore. The `undo` command uses `Model#canUndoAddressBook()` to check if this is the case. If so, it will return an error to the user rather
than attempting to perform the undo.

</box>

The following sequence diagram shows how an undo operation goes through the `Logic` component:

<puml src="diagrams/UndoSequenceDiagram-Logic.puml" alt="UndoSequenceDiagram-Logic" />

<box type="info" seamless>

**Note:** The lifeline for `UndoCommand` should end at the destroy marker (X) but due to a limitation of PlantUML, the lifeline reaches the end of diagram.

</box>

Similarly, how an undo operation goes through the `Model` component is shown below:

<puml src="diagrams/UndoSequenceDiagram-Model.puml" alt="UndoSequenceDiagram-Model" />

The `redo` command does the opposite — it calls `Model#redoAddressBook()`, which shifts the `currentStatePointer` once to the right, pointing to the previously undone state, and restores the address book to that state.

<box type="info" seamless>

**Note:** If the `currentStatePointer` is at index `addressBookStateList.size() - 1`, pointing to the latest address book state, then there are no undone AddressBook states to restore. The `redo` command uses `Model#canRedoAddressBook()` to check if this is the case. If so, it will return an error to the user rather than attempting to perform the redo.

</box>

Step 5. The user then decides to execute the command `list`. Commands that do not modify the address book, such as `list`, will usually not call `Model#commitAddressBook()`, `Model#undoAddressBook()` or `Model#redoAddressBook()`. Thus, the `addressBookStateList` remains unchanged.

<puml src="diagrams/UndoRedoState4.puml" alt="UndoRedoState4" />

Step 6. The user executes `clear`, which calls `Model#commitAddressBook()`. Since the `currentStatePointer` is not pointing at the end of the `addressBookStateList`, all address book states after the `currentStatePointer` will be purged. Reason: It no longer makes sense to redo the `add n/David …​` command. This is the behavior that most modern desktop applications follow.

<puml src="diagrams/UndoRedoState5.puml" alt="UndoRedoState5" />

The following activity diagram summarizes what happens when a user executes a new command:

<puml src="diagrams/CommitActivityDiagram.puml" width="250" />

#### Design considerations:

**Aspect: How undo & redo executes:**

* **Alternative 1 (current choice):** Saves the entire address book.
  * Pros: Easy to implement.
  * Cons: May have performance issues in terms of memory usage.

* **Alternative 2:** Individual command knows how to undo/redo by
  itself.
  * Pros: Will use less memory (e.g. for `delete`, just save the person being deleted).
  * Cons: We must ensure that the implementation of each individual command are correct.

_{more aspects and alternatives to be added}_

### \[Proposed\] Data archiving

_{Explain here how the data archiving feature will be implemented}_


--------------------------------------------------------------------------------------------------------------------

## **Documentation, logging, testing, configuration, dev-ops**

* [Documentation guide](Documentation.md)
* [Testing guide](Testing.md)
* [Logging guide](Logging.md)
* [Configuration guide](Configuration.md)
* [DevOps guide](DevOps.md)

--------------------------------------------------------------------------------------------------------------------

## **Appendix: Requirements**D  

### Product scope

**Target user profile**:

* works as a freelance nutritionist, often visiting multiple patients daily
* has a need to manage a significant number of patient profiles, including contact information, medical history, dietary restrictions, and follow-ups
* prefers efficiency and speed in managing patient data, with the ability to update and search profiles quickly
* can type fast and prefers typing commands over using a mouse or graphical user interface (GUI)
* is comfortable using command-line interfaces (CLI) for managing data and interactions
* values portability and the ability to work across different devices without the need for installation or complex setups

**Value proposition**: manage patient profiles faster and more efficiently than traditional GUI-driven applications by utilizing a CLI, with features designed to streamline patient management, scheduling, and follow-ups, all in a portable, easy-to-use format.


### User stories


| As a …            | I want to …                                | So that I can…                                  | Notes                                                                                          |
|-------------------|--------------------------------------------|-------------------------------------------------|------------------------------------------------------------------------------------------------|
| Busy Nutritionist | Search for a patient by name               | Quickly access relevant dietary information     | Search results should be fast and accurate.                                                   |
| Busy Nutritionist | Add tags to classify my patients easily    | Easily filter and find the relevant patients    | Allow for multiple tags per patient. The system should allow filtering based on tags.         |
| Busy Nutritionist | Undo my last action when using the application | Easily revert to the original state in the event of mistakes or change of plans | Limits to actions that modify data only.                                                     |
| Busy Nutritionist | Schedule Follow-up Appointment             | See and review patient’s status after an appropriate time |                                                                                          |
| Busy Nutritionist | Set reminders for follow-up appointments   | Not forget important patient visits             | Notifications should appear on a dashboard.                                                  |
| Busy Nutritionist | Receive notifications about patient dietary updates | Stay informed                                | Push/email notifications should be configurable.                                             |
| Elderly Nutritionist | Enable high-contrast colors              | Easily read and navigate the app                | A toggle option for high contrast should be available in settings.                            |
| Elderly Nutritionist | Increase the font size                   | Read text comfortably                           | Font size settings should be adjustable in the UI.                                            |
| First-Time Nutritionist | Ensure no duplicates in the patient’s information are added | Refer to the correct information and make necessary changes | Alert the user of possible duplication when adding a new patient.                        |
| First-Time Nutritionist | Access the application’s help function | Learn how to use the application effectively    | List down all available commands that the user can use.                                       |
| First-Time Nutritionist | See some sample contacts when I open the app | Easily try out its features without needing to add my data first |                                                                                |
| Nutritionist      | Add new patients to the system             | Maintain an updated record of my clients        | Each new patient should have a unique profile.                                                |
| Nutritionist      | Delete patient records                     | Remove outdated or irrelevant data              | A confirmation prompt should appear before deletion.                                          |
| Nutritionist      | Clear all data in the application          | Reset the application when necessary            | Requires confirmation to prevent accidental reset.                                            |
| Nutritionist      | Filter patients based on dietary conditions| Group similar cases                             | Filters should be easy to apply and reset.                                                    |
| Nutritionist      | Edit/Update patient information            | Keep records accurate                           | Changes should be logged with timestamps.                                                     |
| Nutritionist      | View a patient's information               | Make informed dietary recommendations           | Medical history should be displayed clearly and concisely. Allergies should be highlighted.   |
| Nutritionist      | Archive patients that no longer require visits | Keep track of their information, yet not clutter up the address book | Able to retrieve archived information easily when needed.                                  |
| Nutritionist      | Upload and attach files to patient profiles | Have all relevant data in one place             | Users should be able to upload PDFs, images, and other common file types.                     |
| Nutritionist      | Sort patients based on name                | Find patients at a glance                       | Sorting options can allow easy finding of patients.                                           |
| Nutritionist      | Mark high-risk patients                    | Quickly identify those needing urgent attention | High-risk patients should be visually highlighted.                                            |
| Nutritionist      | Add emergency contacts to a patient profile | Contact them in urgent situations               | Emergency contacts should be stored and easily accessible.                                    |
| Nutritionist      | Add custom notes to a patient’s profile    | Track observations over time                    | Notes should be editable and timestamped.                                                     |

User stories for the MVP version:

| As a …        | I want to …                                | So that I can…                                  | Notes                                                                                  |
|---------------|--------------------------------------------|-------------------------------------------------|----------------------------------------------------------------------------------------|
| Nutritionist  | View a patient's medical history, food allergies, and dietary restrictions | Make informed dietary recommendations           | Medical history should be displayed clearly and concisely. Allergies should be highlighted in the profile. |
| Nutritionist  | Add new patients to the system             | Maintain an updated record of my clients        | Each new patient should have a unique profile.                                         |
| Nutritionist  | Delete patient records                     | Remove outdated or irrelevant data              | A confirmation prompt should appear before deletion.                                   |


### Use cases

(For all use cases below, the **System** is the `AddressBook` and the **Actor** is the `Nutritionist (user)`, unless specified otherwise)


**Use Case: UC01 - Edit Patient Information**

**MSS:**

1.  Nutritionist selects a patient from the patient list or searches by name/ID.
2.  HMS displays the selected patient’s profile.
3.  Nutritionist clicks on the ‘Edit’ button to modify patient information.
4.  HMS provides editable fields (e.g., contact details, dietary restrictions).
5.  Nutritionist makes necessary changes and submits the updated information.
6.  HMS verifies the updated data and requests confirmation.
7.  Nutritionist confirms the updates.
8.  HMS saves the updated information and displays the updated profile. Use case ends.


**Use Case: UC02 - Delete Patient Record**

**MSS:**

1.  Nutritionist searches for a patient by name or ID in the HMS.
2.  HMS displays the search results.
3.  Nutritionist selects the patient whose record needs to be deleted.
4.  HMS displays the patient's full profile.
5.  Nutritionist selects the option to delete the patient record.
6.  HMS requests confirmation to ensure the deletion is intentional.
7.  Nutritionist confirms the deletion.
8.  HMS deletes the patient record and confirms the deletion to the Nutritionist. Use case ends.

**Extensions:**

* 7a. Nutritionist cancels the deletion at the confirmation step. 
  * 7a1. HMS cancels the deletion process and retains the patient record. 
    Use case ends.



**Use Case: UC03 - Archive Patient**

**MSS:**

1.  Nutritionist accesses the patient list and selects a patient.
2.  HMS displays the patient’s profile.
3.  Nutritionist selects the option to archive the patient’s profile.
4.  HMS asks for confirmation to archive to prevent accidental archiving.
5.  Nutritionist confirms the archiving.
6.  HMS archives the patient’s profile and confirms the action to the Nutritionist. Use case ends.

**Extensions:**

* 4a. Nutritionist decides not to archive the profile at the confirmation step. 
  * 4a1. HMS cancels the archiving request. 
    Use case ends.


**Use Case: UC04 - Add Patient Tag**

**MSS:**
1.  Nutritionist selects the patient to tag from the patient list.
2.  HMS displays the patient's profile.
3.  Nutritionist chooses to add a tag.
4.  HMS prompts for the tag details.
5.  Nutritionist enters the tag (e.g., "Diabetic", "Low Sodium") and submits.
6.  HMS confirms the tag addition and updates the patient's profile.
   Use case ends.

**Extensions:**

* 4a. HMS detects an error in the entered tag (e.g., forbidden characters).
  * 4a1. HMS displays an error message.
  * 4a2. Nutritionist corrects the tag information.
    Steps 4a1-4a2 are repeated until valid information is entered.
    Use case resumes from step 6.

* 6a. Nutritionist decides to add multiple tags at once.
  * 6a1. HMS allows entry of additional tags. 
  * 6a2. Nutritionist enters and submits additional tags. 
  * 6a3. HMS updates the patient's profile with all new tags.
    Use case ends.


* 6b. HMS is unable to update the patient profile due to a system error. 
  * 6b1. HMS displays an error message indicating the failure.
  * 6b2. HMS offers the option to retry.
  * 6b3. Nutritionist retries the submission or cancels. Use case resumes at step 5 if retried, ends if cancelled
    Use case ends.


**Use Case: UC05 - Schedule Follow-up Appointment**

**MSS:**

1. Nutritionist accesses the appointment scheduling feature in HMS.
2. Nutritionist selects a patient from the list and chooses to schedule a follow-up.
3. HMS displays the appointment scheduling form.
4. Nutritionist enters the date, time, and nature of the follow-up.
5. HMS requests confirmation of the details.
6. Nutritionist confirms.
7. HMS schedules the appointment and sends a confirmation to the Nutritionist.
   Use case ends.

**Extensions:**

* 4a. The selected date/time is unavailable. 
  * 4a1. HMS notifies about the scheduling conflict. 
  * 4a2. Nutritionist selects a new date/time.
    Use case resumes from step 5.

* 5a. Nutritionist decides to set a reminder for the appointment. 
  * 5a1. HMS provides options for setting reminders. 
  * 5a2. Nutritionist sets and confirms the reminder details.
    Use case resumes at step 7.

* 7a. HMS encounters a system error while scheduling the appointment. 
  * 7a1. HMS displays an error message and offers to retry. 
  * 7a2. Nutritionist retries or cancels the scheduling. 
    Use case resumes at step 3 if retried, ends if cancelled.
### Non-Functional Requirements

1.  Should work on any _mainstream OS_ as long as it has Java `17` or above installed.
2.  Should be able to hold up to 1000 persons without a noticeable sluggishness in performance for typical usage.
3.  A user with above average typing speed for regular English text (i.e. not code, not system admin commands) should be able to accomplish most of the tasks faster using commands than using the mouse.
4.  Should respond within 5 seconds for most user interactions.
5.  The application should be portable, working without an installer. It should be distributed in a single JAR file for easy execution on different platforms.
6.  Data should be stored in a human-editable file, ensuring that the nutritionist can manually back up or recover patient data if needed.
7.  The GUI should work well for standard screen resolutions 1920x1080 and higher, and, for screen scales 100% and 125%.
8.  The GUI should be usable for resolutions 1280x720 and higher, and, for screen scales 150%.
9.  The application should not use a DBMS to store data.
10.  The product's file size, including the JAR file and necessary assets, should not exceed 100MB.
11.  The user guide (UG) and design document (DG) should each be under 15MB, with optimized images and content to meet the file size limit.

*{More to be added}*

### Glossary

* **Mainstream OS**: Windows, Linux, Unix, MacOS
* **Private contact detail**: A contact detail that is not meant to be shared with others
* **Patient**: A person under the care of the nutritionist, whose dietary information, medical history, and personal details are tracked within the system.
* **Nutritionist**: A healthcare professional who advises on diet and nutrition, helping individuals improve their health through dietary recommendations.
* **Patient profile**: A record containing a patient’s personal details, medical history, food allergies, dietary restrictions, and other relevant health information. 
* **Diet**: The specific food and beverage intake recommended or required for a person, often based on health conditions or preferences (e.g., low sodium, low carb).
* **Allergies**: Substances or foods that a patient is sensitive or allergic to, which must be taken into account when making dietary recommendations.
* **Tag**: A label assigned to a patient that helps categorize and filter patients based on specific conditions or characteristics (e.g. “high-risk”, “low sodium diet”).
* **Priority**: The level of importance or urgency assigned to a task or patient. For example, a high-priority patient needs immediate attention, while low-priority patients may not require urgent care.
* **Reminder**: A notification or alert set by the nutritionist to prompt follow-up actions or visits for patients based on their care schedule.
* **Consultation Log**: A record of all interactions with a patient, including the date, purpose, and key details from the consultation.
* **Stale Records**: Patient profiles that have not been updated or accessed in a long time. These records are flagged for follow-up or archiving to keep the patient list organized.
* **CLI (Command-Line Interface)**: A text-based interface where users type commands to interact with the software.
* **GUI (Graphical User Interface)**: An interface that allows users to interact with the software through visual elements like buttons and icons.
* **DBMS (Database Management System)**: A software used to store, manage, and retrieve data in databases. Not used in this project.
* **JAR File (Java ARchive)**: A compressed file that contains Java classes, libraries, and resources, packaged for distribution.

--------------------------------------------------------------------------------------------------------------------

## **Appendix: Instructions for manual testing**

Given below are instructions to test the app manually.

<box type="info" seamless>

**Note:** These instructions only provide a starting point for testers to work on;
testers are expected to do more *exploratory* testing.

</box>

### Launch and shutdown

1. Initial launch

   1. Download the jar file and copy into an empty folder

   1. Double-click the jar file Expected: Shows the GUI with a set of sample contacts. The window size may not be optimum.

1. Saving window preferences

   1. Resize the window to an optimum size. Move the window to a different location. Close the window.

   1. Re-launch the app by double-clicking the jar file.<br>
       Expected: The most recent window size and location is retained.

1. _{ more test cases …​ }_

### Deleting a person

1. Deleting a person while all persons are being shown

   1. Prerequisites: List all persons using the `list` command. Multiple persons in the list.

   1. Test case: `delete 1`<br>
      Expected: First contact is deleted from the list. Details of the deleted contact shown in the status message. Timestamp in the status bar is updated.

   1. Test case: `delete 0`<br>
      Expected: No person is deleted. Error details shown in the status message. Status bar remains the same.

   1. Other incorrect delete commands to try: `delete`, `delete x`, `...` (where x is larger than the list size)<br>
      Expected: Similar to previous.

1. _{ more test cases …​ }_

### Saving data

1. Dealing with missing/corrupted data files

   1. _{explain how to simulate a missing/corrupted file, and the expected behavior}_

1. _{ more test cases …​ }_
