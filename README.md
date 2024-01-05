# API_Automation
This automation practice, implemented in Jenkins, focuses on API testing using the Star Wars API (swapi). It's important to note that the practice was conducted on a **Linux environment**. Therefore, instead of using **bat** for commands (which is common in Windows), the **sh** command is used to execute shell commands on Linux.

# About API Automation

**CheckPeople2Test**

Description: Evaluates the people/2/ endpoint through the following actions:

-Verifies a successful response.

-Validates that the skin color is gold.

-Ensures the character appears in 6 films.

**FilmValuesTest**

Description: Examines the endpoint of the second movie associated with people/2/ through the following actions:

-Checks the release date in the correct format.

-Ensures the response includes characters, planets, starships, vehicles, and species, each having more than 1 element.

**PlanetValuesTest**

Description: Tests the endpoint of the first planet present in the last film's response.

**Actions:**

-Check the gravity and terrains, ensuring they match the exact values returned by the request (using fixtures for data storage).

-Grab the URL element from the response and request it.

-Validate that the response is exactly the same as the previous one.

**VerificationErrorTest**

Description: Tests the /films/7/ endpoint.

**Actions:**

-Check that the response has a 404 status code.

**CompareURLResponseTest**

Description: The CompareURLResponseTest class focuses on assessing the consistency between the selected planet's URL and the URI provided by the API. This validation ensures the accuracy and integrity of the retrieved data.

Validates the equality of the URL components, ensuring a precise match between the provided URI and the selected planet's URL.

**Actions:**

-Extract URL Components

-Sends a request to the API to obtain the URI associated with the selected planet.

-Compare Components

-Compares the extracted URL components with the components of the API's URI to identify any discrepancies.


# PipeLine
## **Stages:**

**Clone and Fetch:**

This stage initiates the cloning process for the project repository and retrieves the most recent changes. It utilizes Git for cloning the repository and fetching updates.

**Compile:**

This stage is responsible for compiling the project, ensuring that all dependencies are resolved. It executes Maven with the clean and package goals to perform the compilation and packaging of the project. Tests are omitted during this stage.

**Execute Tests:**

This stage executes the test suite with specified parameters. It uses Maven with the test goal, passing parameters for the base URL and the test suite file. The Allure plugin is employed to generate comprehensive test reports.

## **Parameters:**

**url:**

Type: String

Default Value: 'https://swapi.dev/api'

Description: Base URL.

**suitePath:**

Type: String

Default Value: 'src/test/resources/Suite.xml'

Description: Path suite.

# **Requirements to Jenkins**

**Maven:**

Install Maven on the Jenkins server (You will use the assigned name for your jenkins file in tools).
Configure Maven in Jenkins Global Tool Configuration.

**Allure:**

Install the Allure command-line tools on the Jenkins server.

## **Create and Configurate Pipeline project**

**Install Required Tools:**

Ensure that Jenkins has the necessary tools installed.

Maven: Install Maven on the Jenkins server and configure it in Jenkins Global Tool Configuration.

Allure: Install Allure command-line tools on the Jenkins server.

**Create a New Pipeline Job:**

In Jenkins, create a new pipeline job.

**In the pipeline configuration:**

-**Select:** "Pipeline script from SCM"

-Select SCM (Source Code Management) as **Git**, and provide the repository URL:

-**Repository URL:** https://github.com/DanRCM/API_Automation_Jenkins

### In the "Branch Specifier" section, ensure it is set to:

-**Branch Specifier:** */main

-**Specify the Script Path:**

Script Path: Jenkins/JenkinsFile

-Save and run.

# API

**Base URL:** https://swapi.dev/

# Contact:

Name: Daniel Cortez
email: rcortezmanzano24@gmail.com

