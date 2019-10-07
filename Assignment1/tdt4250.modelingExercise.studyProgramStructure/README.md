## Assignment 1
This is assiginment 1 for the course tdt4250. The task is to create a study plan, containing programs, courses, specialisations and semesters.

In the folder tdt4250.modelingExercise.studyProgramStructure you will find the "model" folder which contains the ecore model and the generator model. You will also find the "src/studyProgramStructure" folder which contains all the generated code; interfaces, java classes and utils.

#### Structure of the study plan
The ide is that there is a study plan containing programs. Each program contains specialisations and semesters. Course is a class that describes a course, but because they can be a part of different specialisations, they are contained in a SemesterCourse class, which specifies whether the course is mandatory or elective. SemesterCourses can be contained in CourseGroups. The semester class can contain either a CourceGroups or SemesterCources.
