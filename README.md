# SpringOne-Camunda-Coding-Challenge
A fun way to learn Camunda and win a small price. The coding challenge is designed for the SpringOne Conference. Results can be hand in from the **1st of September till the 08th of September 2021**. 

## Table of Contents  
**[How to win](#how-to-win)**  
**[Prerequirements](#prerequirements)**  
**[The challenge](#the-challenge)**  
[Challenge 1: Get the right order of the process](#challenge-1-get-the-right-order-of-the-process)  
[Challenge 2: Correct the variables](#challenge-2-correct-the-variables)  
**[Evaluation of your results](#evaluation-of-your-results)**   
**[Run the application (process) - test if your process works](#run-the-application-process---test-if-your-process-works)**  
[In your IDE](#in-your-ide)



## How to win 
- Fork this repo
- Do the challenges. You can do both challenges or just the first one. There are different levels and prizes for your performance.
- Send us a link to your fork and your address in order to ship a prize and your :shirt: size to community@camunda.com with the subject: "SpringOne Coding Challenge"

## Prerequirements 
- Make sure you have Java installed and that you use a version below 15. You can check the version in your terminal: `java -version`
- Install the [Camunda Modeler](https://camunda.com/download/modeler/) on your machine
- Fork the project and open it in your IDE

:tada: You are ready to hack!

## The challenge

### Challenge 1: Get the right order of the process
Get the right chronological order of the movie pulp fiction! 

Inspect the project:  
![project structure](/img/project.png)

Navigate to src/main/resources and open the process.bpmn in the Camunda Modeler! 

You will see a process similar to this one: 

![project structure](/img/process-without-tasks.png)

Below the connected process with sequence flows, gateways and events you see tasks that are unconnected. The tasks form the story of the movie [Pulp Fiction](https://en.wikipedia.org/wiki/Pulp_Fiction). Darg and Drop them in the right chronological order on the sequence flow.  

Note: Make sure to save your model :)  

### Challenge 2: Correct the variables

In order to get the right story plot you have to change some of the variables in the task: 

**Script Task "Royal and Cheese conversation":** 
Make sure that the the variable "lastTravel" is set to "Europe". To do so select the Script Task and open in the Camunda Modeler on the right hand site the Property panel and inspect the inline Script

**Service Task: "Prepare To Go Out With Mia"**: 
This Service task is implemented as a Delegate. Go into your IDE and look in the path: src/main/java/camunda.example.workflow for the "PrepareToGoOutDelegate". Change inside the Delegate the variable "drug" to "heroin". 

## Evaluation of your results
- Challenge 1: You got the right or almost right order. The BPMN tasks are connected on the sequence flow: we send you a small price.
- Challenge 1 + 2: You got the right or almost right order and changed the variables: we send you a medium price
- Challenge 1+2 without any mistakes. It is possible to start an instance of your process and route your process till the end without runtime errors:  we send you a large price

## Run the application (process) - test if your process works  
Running the application and starting an instance of the process will give you a hint if you got the right order. If the order is right your instance will run through. If the order is not correct potentially you will get runtime errors due to missing variables.

If you want to try out your solution and run it you can start the the application class in the project:  

### In your IDE

![Application class](/img/applicationClass.png)  

Right click on the class and select: `Run 'Application'`  


### Camunda's Webapplications

Once the application has started type in your browser:  
http://localhost:8080/camunda/app/welcome/default/#!/login   

Log in with the credentials:  
```
username: demo    
password: demo   
```
### Start a process instance

Choose the Tasklist application:  
![project structure](/img/applications.png)

Start the process from there:  
![project structure](/img/startProcess.png)  


### Terminal in your IDE

Observe your Terminal in your IDE and see what will be printed. You should be able to see the story of pulp fiction printed in your Terminal based on how you placed the tasks. Hint: Maybe you can identify already with that help if your order is correct. 


### Runtime Errors

Maybe you will get a runtime error due to a missing variable or an expression that cannot be resolved. This can happen for example if you start the process from Tasklist or if you complete a usertask and could look similar to this one:  

![error message](/img/Error-message.png) 

If that is the case the order of your process might not be right. Try to fix it and see where the variable that you need for a certain task is initiated.  

:pushpin: *Note: There are better ways to handle errors in Camunda and normally they are not displayed at the user frontend. If you want to learn more about it you can read more about [transactions](https://docs.camunda.org/manual/7.15/user-guide/process-engine/error-handling/) and [error handling](https://camunda.com/best-practices/dealing-with-problems-and-exceptions/) in Camunda or watch this [tutorial](https://www.youtube.com/watch?v=tjR3GIsdGxk)*



### Cockpit: Observe the state of your process
In Camunda's webapplications in the right upper corner is a house symbole that allows you to switch between the web applications:  
![project structure](/img/house.png)  
Go to Cockpit. In order to observer your process instances select running instances.   
![cockpit](/img/cockpit.png)

(Note: If your process instance has ended already you won't see it anymore. A running process instance is marked with a blue token)  
![user task in Cockpit](/img/usertask-cockpit.png)

### Tasklist: Claim and complete usertasks from your process

If your process instance stands on a User Task. Naviagte back to Tasklist. You should see here an available task:  

![user task in Tasklist](/img/usertask.png)

1. Claim the task and complete it. 
2. Look at the form: Do you still remeber what happens with the golden watch in Pulp Fiction and if Butch takes it directly with him while escaping?
3. Complete the task








