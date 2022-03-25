This is a project for sorting the integer array which is passed in through console log.

**Main class** - 
com.santander.arraysort.service.ArraySortRunner

**Usage** -
To run the utility you should run the the main class. (Cannot run from gradle file)

To download the dependencies, once cloned the project, use:
gradlew eclipse or gradle eclipse --refresh-dependencies

You can use other command lines such as:
gradle -clean eclipse
gradle -clean eclipse --refresh-dependencies
gradle clean build -x test --refresh-dependencies


**Output**
Json file named **SortedValue.json** which will stored the entered values in ascending order
This file will be placed at the report folder within the root of the project.
