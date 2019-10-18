
## Assignment 1
This is assiginment 1 for the course tdt4250. The task is to create a study plan, containing programs, courses, specialisations and semesters.
 
In the folder tdt4250.modelingExercise.studyProgramStructure you will find the "model" folder which contains the ecore model and the generator model. You will also find the "src/studyProgramStructure" folder which contains all the generated code; interfaces, java classes and utils.


## Assignment 3

In order to run to run this project, go to the `src` folder, and then the `org.eclipse.acceleo.module.assignment3.main` package. Right click on the `generate.mtl` file,
and choose `Run as` > `Launch Acceleo Application`. If there is a need for configuration, click on the `Run Configurations...` instead.
In the Run Configuration editor there should be the following settings:
- __Project__: _org.eclipse.acceleo.module.assignment3_
- __Main class__: _org.eclipse.acceleo.module.assignment3.main.Generate_
- __Model__: _/tdt4250.modelingExercise.studyProgramStructure/model/University.xmi_
- __Target__: _/org.eclipse.acceleo.module.assignment3/dump_

There should now have been generated one or several html files from the model instance from Assignment 1, and they can be found in the `dump` folder.



