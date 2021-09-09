# SpringOne-Camunda-Coding-Challenge

A fun way to learn about Camunda and win a small prize. The coding challenge is designed for the SpringOne Conference. Results may be submitted from **September 1–8, 2021**. 

## Table of Contents

- **[How to win](#how-to-win)**  
- **[Prerequisites](#prerequirements)**  
- **[The challenge](#the-challenge)**  
  - [Challenge 1: Get the right order of the process](#challenge-1-get-the-right-order-of-the-process)  
  - [Challenge 2: Correct the variables](#challenge-2-correct-the-variables)  
- **[Evaluation of your results](#evaluation-of-your-results)**   
- **[Run the application (process) - test if your process works](#run-the-application-process---test-if-your-process-works)**  
  - [In your IDE](#in-your-ide)  
  - [Camunda's webapplications](#camundas-webapplications)   
  - [Start a process instance](#start-a-process-instance)   
  - [Terminal in your IDE](#terminal-in-your-ide)   
  - [Cockpit](#cockpit-observe-the-state-of-your-process)   
  - [Tasklist](#tasklist-claim-and-complete-user-tasks-from-your-process)  

## How to win

- Fork this repo.
- Complete the challenges. You can do both challenges or just the first one. There are different levels and prizes for your performance.
- Send us a link to your fork, your address, and your :shirt: size to community@camunda.com with the subject: "SpringOne Coding Challenge" so we can mail you your prize!

## Prerequisites

- Make sure you have Java installed and you use a version below 15. Check your version of Java in the terminal with the following command: `java -version`
- Install [Camunda Modeler](https://camunda.com/download/modeler/) on your machine.
- Fork the project and open it in your IDE.

:tada: You are ready to hack!

## The challenge

### Challenge 1: Get the right order of the process

Get the right chronological order of the movie [Pulp Fiction](https://en.wikipedia.org/wiki/Pulp_Fiction). Take the folllowing steps:

1. Inspect the project:  
![project structure](/img/project.png)

2. Navigate to `src/main/resources` and open `process.bpmn` in Camunda Modeler.

You will see a process similar to this one: 

![project structure](/img/process-without-tasks.png)

3. Below the connected process with sequence flows, gateways, and events, note the tasks that are unconnected. The tasks form the story of the movie Pulp Fiction. Drag and drop the events in the correct chronological order on the sequence flow.  

:pushpin: Note: Make sure to save your model :)  

### Challenge 2: Correct the variables

To get the correct story plot, you must change some of the variables in the task: 

**Script Task "Royal and Cheese conversation"**:    
Ensure the variable `lastTravel` is set to `Europe`. To do so, select the script task and open it in Camunda Modeler on the right-hand side via the Property panel. Inspect the inline script.

**Service Task: "Prepare To Go Out With Mia"**:   
This service task is implemented as a delegate. Go into your IDE and look in the path: `src/main/java/camunda.example.workflow` for the `PrepareToGoOutDelegate` class. Change the class the variable `drug` to `heroin`. 

## Evaluation of your results

- Challenge 1: You got the correct or close to correct order. The BPMN tasks are connected on the sequence flow:   
We will send you a small prize. :gift:
- Challenge 1 + 2: You got the correct or close to correct order and changed the variables:   
We will send you a medium prize :gift: :gift:
- Challenge 1 + 2 without any mistakes. It is possible to start an instance of your process and route your process through the end without runtime errors:   
We will send you a large prize :gift: :gift: :gift:

## Run the application (process) - test if your process works

Running the application and starting an instance of the process will give you a hint if you got the right order. If the order is correct, your instance will run through. If the order is not correct, you may potentially get runtime errors due to missing variables.

If you want to try out your solution and run it, start the the application class in the project:  

### In your IDE

![Application class](/img/applicationClass.png)  

Right click on the class and select: `Run 'Application'`  

### Camunda's Webapplications

Once the application has started, type in your browser:  
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

Observe your Terminal in your IDE and see what will be printed. You should be able to see the story of Pulp Fiction printed in your Terminal based on how you placed the tasks. Hint: Maybe you can identify already with that help if your order is correct. 

### Runtime Errors

You may get a runtime error due to a missing variable or an expression that cannot be resolved. For example, this may happen if you start the process from Tasklist or if you complete a user task and may look similar to the following:  

![error message](/img/Error-message.png) 

If this is the case, the order of your process might not be right. Try to fix it and see where the variable that you need for a certain task is initiated.  

:pushpin: *Note: There are better ways to handle errors in Camunda and normally they are not displayed at the user frontend. If you want to learn more about it, read more about [transactions](https://docs.camunda.org/manual/7.15/user-guide/process-engine/error-handling/) and [error handling](https://camunda.com/best-practices/dealing-with-problems-and-exceptions/) in Camunda, or watch this [tutorial](https://www.youtube.com/watch?v=tjR3GIsdGxk).*

### Cockpit: Observe the state of your process

In the top right corner of Camunda's webapplications is a house symbol that allows you to switch between the web applications:  
![project structure](/img/house.png)

Go to Cockpit. To observe your process instances, select running instances.   
![cockpit](/img/cockpit.png)

(Note: If your process instance has ended already, you won't see it anymore. A running process instance is marked with a blue token.)  
![user task in Cockpit](/img/usertask-cockpit.png)

### Tasklist: Claim and complete user tasks from your process

If your process instance stands on a user task, navigate back to Tasklist. Here, you should see an available task:  

![user task in Tasklist](/img/Usertask.png)

1. Claim the task and complete it.
2. Look at the form. Do you still remember what happens with the golden watch in Pulp Fiction, and if Butch takes it directly with him while escaping?
3. Complete the task.
